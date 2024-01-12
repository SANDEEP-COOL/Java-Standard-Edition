import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;



public class SortHashMapByValues {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(10, "A");
        hm.put(5, "B");
        hm.put(4, "C");
        hm.put(2, "D");

        System.out.println(hm);

        List<Entry<Integer, String>> list = new LinkedList<>(hm.entrySet());

        System.out.println(list);
        
        Collections.sort(list, new SortHashMapByValues.ValueComparator());
        
        System.out.println(list);
    }

    static class ValueComparator implements Comparator<Entry<Integer, String>>{
        
        @Override
        public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {

            return e1.getValue().compareTo(e2.getValue());

        }

    }
}
