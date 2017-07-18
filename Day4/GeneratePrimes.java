import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class GeneratePrimes {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        int n = 1000;

        list = PrimeNumbers.generate(n);
        System.out.println(list);

    }

    public static List<Integer> generate(int n) {

        for (int i = 0; i <= n; i++) {
            list.add(i);
        }

        return list;
    }
       /* for (int i = 2; i <= n; i++) {
            if(list.get(i) != 0) {
                for (int j = i; j <= n; j+=i) {
                    list.set(j, 0);
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= n; i++)
            if(list.get(i) != 0)
                result.add(i);

        return result;
        */

}