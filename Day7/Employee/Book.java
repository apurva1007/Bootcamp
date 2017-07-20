/**
 * Created by ruplaga on 7/19/2017.
 */
public class Book implements Comparable{
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Book book1 = (Book) this;
        Book book2 = (Book) o;

        int ans = book1.price - book2.price;
        return ans;
    }
}
