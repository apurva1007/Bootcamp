/**
 * Created by ruplaga on 7/19/2017.
 */
public class CompareId implements Compare {
    @Override
    public boolean isGreaterThan(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        int ans = e1.employeeId - e2.employeeId;
        if(ans > 0)
            return true;
        else
            return false;
    }
}
