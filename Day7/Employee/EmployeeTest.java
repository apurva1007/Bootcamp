import org.junit.Test;

import java.util.*;

/**
 * Created by ruplaga on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList = createTestData();
        printEmployeeData(employeeList);

        System.out.println();
        CompareId compareByIds = new CompareId();
        CompareNames compareByName = new CompareNames();
        employeeList = MyUtil.sort(employeeList, compareByName);
        printEmployeeData(employeeList);

    }


    /*@Test
    public void testEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList = createTestData();
        printEmployeeData(employeeList);

        CompareId compareByIds = new CompareId();
        CompareNames compareByName = new CompareNames();
        employeeList = MyUtil.sort(employeeList, compareByName);
        printEmployeeData(employeeList);
    }

    @Test
    public void testBooks(){
        MyUtil.sort(booksList, compareByPrice);
    }

    @Test
    public void testArraysSort(){
        Arrays.sort(booksArray, priceComparator );
    }

    @Test
    public void testSortWithComparable(){
        Arrays.sort(booksArray);
        // Book implement comparable
    }*/
//    private static List<Employee> sortEmployeeData(List<Employee> employeeList) {
//
//        List<Employee> list = new ArrayList<>();
//        Collections.sort(employeeList, );
//        return list;
//    }

    private static void printEmployeeData(List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
    }

    public static List<Employee> createTestData() {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee(111, "Apurva", new Date(1995, 07, 10), new Date(2000, 2, 7) , 7, Location.Pune);
        employeeList.add(employee1);
        Employee employee2 = new Employee(2, "Deepika", new Date(1995, 10, 10), new Date(2010, 4, 5) , 2, Location.Pune);
        employeeList.add(employee2);
        Employee employee3 = new Employee(313, "Arshi", new Date(1995, 4, 1), new Date(2002, 5, 9) , 5, Location.Pune);
        employeeList.add(employee3);
        Employee employee4 = new Employee(94, "Rajan", new Date(1995, 6, 4), new Date(2004, 3, 7) , 6, Location.Pune);
        employeeList.add(employee4);
        Employee employee5 = new Employee(51, "Sneh", new Date(1995, 7, 6), new Date(2006, 5, 6) , 8, Location.Pune);
        employeeList.add(employee5);
        Employee employee6 = new Employee(16, "Kamal", new Date(1995, 8, 4), new Date(2007, 7, 17) , 0, Location.Pune);
        employeeList.add(employee6);

        return employeeList;
    }
}
