import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by ruplaga on 7/21/2017.
 */
public class CustomerTest {

    public static void main(String[] args) {

        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put("QWE", 78.83);
        hashMap.put("DFR", 6834.99);
        hashMap.put("RED", 974.09);

        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

    }
}
