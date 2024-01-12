import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(100, "Aajay");
        hm.put(56, "radha");
        hm.put(200, "sunil");

        System.out.println("Before Sorting Based On Keys");
        System.out.println(hm);

        Set<Entry<Integer, String>> entrySet = hm.entrySet();

        Iterator<Entry<Integer, String>> it = entrySet.iterator(); 

        TreeMap<Integer, String> tm = new TreeMap<>();

        while(it.hasNext()) {

            Entry<Integer, String> e = it.next();
            tm.put(e.getKey(), e.getValue());

        }

        System.out.println("After Sorting Based On Keys");
        System.out.println(tm);

    }
}
