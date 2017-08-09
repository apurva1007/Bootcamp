import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class GeneratePrimes {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        int n = 100;

        list = GeneratePrimes.generate(n);
        System.out.println(list);

    }

    public static List<Integer> generate(int n) {

        for (int i = 0; i <= n; i++) {
            list.add(i);
        }

        for (int i = 2; i <= n; i++) {
            int k = 0;
            if (list.get(i) != 0) {
                k = 2 * i;
                for (int j = k; j <= n; j += i) {
//                    System.out.println(j);
                    list.set(j, 0);
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= n; i++)
            if (list.get(i) != 0)
                result.add(i);

        return result;
    }
}