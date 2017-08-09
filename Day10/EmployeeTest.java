import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ruplaga on 7/22/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employeeList = createTestData();

        EmployeeComparator employeeComparator = new EmployeeComparator();
        Collections.sort(employeeList, employeeComparator);

        printData(employeeList);
    }

    private static void printData(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    private static List<Employee> createTestData() {

        Employee e1 = new Employee(1, "Apurva", "Ruplag", "Finance", "Pune");
        Employee e2 = new Employee(2, "Apurva", "Patil", "Finance", "Pune");
        Employee e3 = new Employee(3, "Apurva", "Ruplag", "Finance", "Pune");
        Employee e4 = new Employee(4, "Anuja", "Pawar", "HR", "Hyderabad");
        Employee e5 = new Employee(5, "Mahesh", "Verma", "Finance", "Pune");
        Employee e6 = new Employee(6, "Sushant", "Mehra", "Finance", "Pune");
        Employee e7 = new Employee(7, "Ritesh", "Mane", "Finance", "Pune");
        Employee e8 = new Employee(8, "Suresh", "Sharma", "Finance", "Hyderabad");
        Employee e9 = new Employee(9, "Apurva", "Verma", "Finance", "Pune");
        Employee e10 = new Employee(10, "Deepika", "Singh", "Finance", "Pune");
        Employee e11 = new Employee(11, "Kajal", "Kapoor", "HR", "Pune");
        Employee e12 = new Employee(12, "Sushma", "Kumar", "RD", "Hyderabad");
        Employee e13 = new Employee(13, "Reena", "Khan", "RD", "Pune");
        Employee e14 = new Employee(14, "Ram", "Gopal", "Finance", "Pune");
        Employee e15 = new Employee(15, "Apurva", "Ruplag", "Finance", "Pune");
        Employee e16 = new Employee(16, "Apurva", "Ruplag", "Finance", "Hyderabad");
        Employee e17 = new Employee(17, "Apurva", "Patil", "Finance", "Hyderabad");
        Employee e18 = new Employee(18, "Apurva", "Ruplag", "Sports", "Hyderabad");
        Employee e19 = new Employee(19, "Apurva", "Ruplag", "Finance", "Hyderabad");
        Employee e20 = new Employee(20, "Anuja", "Pawar", "HR", "Hyderabad");
        Employee e21 = new Employee(21, "Mahesh", "Verma", "Sports", "Pune");
        Employee e22 = new Employee(22, "Sushant", "Mehra", "Finance", "Hyderabad");
        Employee e23 = new Employee(23, "Ritesh", "Mane", "Finance", "Hyderabad");
        Employee e24 = new Employee(24, "Suresh", "Sharma", "Finance", "Hyderabad");
        Employee e25 = new Employee(25, "Apurva", "Verma", "Finance", "Pune");
        Employee e26 = new Employee(26, "Deepika", "Singh", "Finance", "Pune");
        Employee e27 = new Employee(27, "Kajal", "Kapoor", "HR", "Pune");
        Employee e28 = new Employee(28, "Sushma", "Kumar", "RD", "Hyderabad");
        Employee e29 = new Employee(29, "Reena", "Khan", "RD", "Pune");
        Employee e30 = new Employee(30, "Ram", "Gopal", "Finance", "Pune");
        Employee e31 = new Employee(31, "Apurva", "Ruplag", "Sports", "Pune");

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31);

        return employeeList;

    }
}
