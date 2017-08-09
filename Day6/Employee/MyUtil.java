import java.util.List;

/**
 * Created by ruplaga on 7/19/2017.
 */
public class MyUtil {

    public static int[] sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                int i1 = list[j - 1];
                int i2 = list[j];
                if (i1 > i2) {
                    int temp = i1;
                    i1 = i2;
                    i2 = temp;
                }
            }
        }

        return list;
    }
    public static List<Employee> sort(List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            for (int j = 1; j < employeeList.size(); j++) {
                if (employeeList.get(j-1).employeeId > employeeList.get(j).employeeId) {
                    Employee temp = employeeList.get(j-1);
                    employeeList.set(j-1, employeeList.get(j));
                    employeeList.set(j, temp);
                }
            }
        }
        return employeeList;
    }

    public static List<Employee> sort(List<Employee> o, Compare c) {

        for (int i = 0; i < o.size(); i++) {
            for (int j = 1; j < o.size(); j++) {
                if (c.compare(o.get(j-1), o.get(j)) == 1) {
                    Employee temp = o.get(j-1);
                    o.set(j-1, o.get(j));
                    o.set(j, temp);
                }
            }
        }

        return o;
    }

    public static void main(String[] args) {
        int[] list = {89, 56, 7, 3, 64, 23};
        MyUtil.sort(list);
        System.out.println(list[0]);
        System.out.println(list[5]);
    }
}
