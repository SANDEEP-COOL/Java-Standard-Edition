import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class IterateHashMap {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("X", 20);
        map.put("C", 40);

        for(Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
        }

        for(String s : map.keySet()) {
            System.out.println(s);
        }

        Set<Entry<String, Integer>> e = map.entrySet();

        Iterator<Entry<String, Integer>> it = e.iterator();
        while(it.hasNext()) {

            System.out.println(it.next());

        }
        
    }

}
