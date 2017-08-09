import java.util.Comparator;

/**
 * Created by ruplaga on 7/19/2017.
 */
public class TitleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;

        int ans = b1.title.compareTo(b2.title);
        return ans;
    }
}
