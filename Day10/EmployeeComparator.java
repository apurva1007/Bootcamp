import java.util.Comparator;

/**
 * Created by ruplaga on 7/22/2017.
 */
public class EmployeeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        int r = e1.getLocation().compareTo(e2.getLocation());
        if (r != 0)
            return r;

        r = e1.getDepartment().compareTo(e2.getDepartment());
        if (r != 0)
            return r;

        r = e1.getFirstName().compareTo(e2.getFirstName());
        if (r != 0)
            return r;

        r = e1.getLastName().compareTo(e2.getLastName());
        if (r != 0)
            return r;

        r = e1.getId() - e2.getId();
        if (r != 0)
            return r;

        return r;
    }
}
