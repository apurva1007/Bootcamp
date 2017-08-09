import java.util.HashSet;

/**
 * Created by ruplaga on 7/21/2017.
 */
public class PersonTest {

    public static void main(String[] args) {
//        Person p1 = new Person("Ramesh", "M");
//        Person p2 = new Person("Ramesh", "M");
//        Person p3 = new Person("Ramesh", "M");
//        Person p4 = new Person("Ramesh", "M");
//
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p3));
//        System.out.println(p4.equals(p1));
//
//        System.out.println(p1.hashCode());
//        System.out.println(p4.hashCode());

        String name = new String("Apurva");
        String name1 = name.intern();

        String name2 = "Apurva";

        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name2 == name);
    }

}
