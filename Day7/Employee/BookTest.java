import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ruplaga on 7/19/2017.
 */
public class BookTest {

    public static List<Book> createTestData() {

        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book("ABC", 678);
        bookList.add(book1);
        Book book2 = new Book("KLM", 6475);
        bookList.add(book2);
        Book book3 = new Book("OPN", 435);
        bookList.add(book3);

        return bookList;
    }

    private static void printBookData(List<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList = createTestData();
        printBookData(bookList);

        CompareByTitle compareByTitle = new CompareByTitle();
        CompareByPrice compareByPrice = new CompareByPrice();
//        bookList = MyUtil.sort(bookList, compareByPrice);
//        printBookData(bookList);
        System.out.println();

        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(bookList, priceComparator);
        printBookData(bookList);

        System.out.println();

        TitleComparator titleComparator = new TitleComparator();
        Collections.sort(bookList, titleComparator);
        printBookData(bookList);

        System.out.println();

        Collections.sort(bookList);
        printBookData(bookList);


    }
}
