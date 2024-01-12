import java.util.HashMap;


public class sizeAndIsEmptyHashMap {
    public static void main(String[] args) {
        

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "A");
        map.put(20, "C");

        // size 
        System.out.println(map.size());

        // isEmpty 
        System.out.println(map.isEmpty());

    }
}
