import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ruplaga on 7/25/2017.
 */
public class EmployeeSalary {

    public static void main(String[] args) {
        ArrayList<Double> salaryList = new ArrayList(10);

        salaryList.add(68483.789);
        salaryList.add(87.97);
        salaryList.add(97343.8);
        salaryList.add(435.79);
        salaryList.add(4663.54);
        salaryList.add(474.789);
        salaryList.add(3774.46);
        salaryList.add(3735.678);
        salaryList.add(574.7);
        salaryList.add(3563.546);

        Iterator<Double> iterator = salaryList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next()*0.3);
        }

    }


}
