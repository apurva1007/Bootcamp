/**
 * Created by ruplaga on 7/19/2017.
 */
public class CompareByPrice implements Compare {
    @Override
    public boolean isGreaterThan(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;

        int ans = book1.price - book2.price;
        if(ans > 0)
            return true;
        else
            return false;
    }
}
