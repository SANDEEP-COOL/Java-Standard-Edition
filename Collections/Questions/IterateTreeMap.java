import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class IterateTreeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(10, "A");
        tm.put(20, "B");

        Set<Entry<Integer, String>> entrySet = tm.entrySet();

        Iterator<Entry<Integer, String>> it = entrySet.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());

        }

    }
}
