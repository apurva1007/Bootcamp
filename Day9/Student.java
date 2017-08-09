import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ruplaga on 7/21/2017.
 */

public class Student {
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if(student == null)
            return false;
        return (rollNo == student.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>();

        createHashSet(set);
        printHashSet(set);
    }
    @Test
    private static void printHashSet(HashSet<Student> set) {

        Iterator<Student> it = set.iterator();

        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println(student);
        }
    }
    @Test
    private static void createHashSet(HashSet<Student> set) {
        Student student1 = new Student("Avinash", 121, "ECE");
        set.add(student1);
        Student student2 = new Student("Avinash", 121, "ECE");
        set.add(student2);
        Student student3 = new Student("Ashwin", 123, "ECE");
        set.add(student3);
    }
}
