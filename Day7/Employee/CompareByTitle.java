/**
 * Created by ruplaga on 7/19/2017.
 */
public class CompareByTitle implements Compare {

    @Override
    public boolean isGreaterThan(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;

        int ans = b1.title.compareTo(b2.title);
        if(ans > 0)
            return true;
        else
            return false;
    }
}
