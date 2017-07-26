import java.util.*;

/**
 * Created by ruplaga on 7/25/2017.
 */
public class CarService {

    public static void main(String[] args) {

        IdComparator idComparator = new IdComparator();
        BrandComparator brandComparator = new BrandComparator();

        Set<Car> carSet = new TreeSet<>();                                  //natural sorting by price(as defined in compareTo() of Car class
        createTestData(carSet);
        System.out.println("Natural Ordering by price: ");
        printData(carSet);
        System.out.println();

/*
        Set<Car> carSet = new TreeSet<>(idComparator);                       //compare by id
        createTestData(carSet);
        System.out.println("Ordering by id: ");
        printData(carSet);
        System.out.println();

        Set<Car> carSet = new TreeSet<>(brandComparator);                    //compare by brand
        createTestData(carSet);
        System.out.println("Ordering by brand: ");
        printData(carSet);
        System.out.println();
*/
    }

    private static void printData(Set<Car> carSet) {
        Iterator<Car> iterator = carSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void createTestData(Set<Car> carSet) {
        carSet.add(new Car(1,88409.789, "DFTV"));
        carSet.add(new Car(2,88409.789, "DETV"));
        carSet.add(new Car(3,409.89, "DERFTV"));
        carSet.add(new Car(4,889.78, "DERV"));
        carSet.add(new Car(5,8849.79, "DETV"));
        carSet.add(new Car(5,8849.79, "DETV"));
        carSet.add(new Car(6,88436.789, "DFTV"));
        carSet.add(new Car(7,88409.789, "DETV"));
        carSet.add(new Car(9,409.89, "DERFTV"));
        carSet.add(new Car(9,889.78, "DERV"));
        carSet.add(new Car(10,8849.79, "DETV"));
        carSet.add(new Car(10,8849.79, "DETV"));
        carSet.add(new Car(11,88409.789, "DFTV"));
        carSet.add(new Car(12,88409.789, "DETV"));
        carSet.add(new Car(13,409.89, "DERFTV"));
        carSet.add(new Car(14,87489.78, "DERV"));
        carSet.add(new Car(14,8849.79, "DETV"));
        carSet.add(new Car(16,8849.79, "DETV"));
        carSet.add(new Car(17,98409.789, "DFTV"));
        carSet.add(new Car(17,34409.789, "DETV"));
        carSet.add(new Car(18,29.89, "DERFTV"));
        carSet.add(new Car(18,81239.78, "DERV"));
        carSet.add(new Car(20,176389.79, "DETV"));
        carSet.add(new Car(20,884739.79, "DETV"));
    }
}
