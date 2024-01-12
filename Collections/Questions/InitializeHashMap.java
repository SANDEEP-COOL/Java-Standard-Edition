import java.util.HashMap;

public class InitializeHashMap {

    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "sandeep");
        map.put(20, "raju");
        map.put(-1, "ajay");

        System.out.println(map);

    }
    
}
