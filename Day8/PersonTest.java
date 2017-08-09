import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ruplaga on 7/20/2017.
 */
public class PersonTest {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        List<Person> tempList;

        tempList = createTestData();
        for (int i = 0; i < 5; i++) {
            personList.addAll(tempList);
        }

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).toString());
        }

        countOccurences(personList);

        System.out.println(personList.get(0).toString() + " " + personList.get(0).hashCode());
        System.out.println(personList.get(3).toString() + " " + personList.get(3).hashCode());
        System.out.println(personList.get(4).toString() + " " + personList.get(4).hashCode());

        System.out.println(personList.get(0).equals(personList.get(3)));


    }

    private static void countOccurences(List<Person> personList) {
        HashMap<String, Integer> personCount = new HashMap<>();

        for (Person person : personList) {
            if (personCount.containsKey(person.getName())) {
                personCount.put(person.getName(), personCount.get(person.getName()) + 1);
            } else {
                personCount.put(person.getName(), 1);
            }
        }

        for (String key : personCount.keySet()) {
            System.out.println(key + " : " + personCount.get(key));
        }

    }

    public static List<Person> createTestData() {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Suresh", 'M');
        personList.add(person1);
        Person person2 = new Person("Ramesh", 'M');
        personList.add(person2);
        Person person3 = new Person("Geeta", 'F');
        personList.add(person3);
        Person person4 = new Person("Suresh", 'M');
        personList.add(person4);

        return personList;


    }
}
