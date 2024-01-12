import java.util.Map;
import java.util.TreeMap;

public class SortMapBasedOnKey {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(2, "B");
        map.put(11, "C");

        System.out.println(map);

    }
    
}
