import java.util.Comparator;

/**
 * Created by ruplaga on 7/19/2017.
 */
public class PriceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;

        int ans = book1.price - book2.price;
        return ans;
    }
}
