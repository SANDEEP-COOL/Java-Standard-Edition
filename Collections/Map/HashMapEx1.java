import java.util.Map;
import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        
        Map<String, Integer> person = new HashMap<>();

        // put 
        person.put("ram", 19);
        person.put("aashifa", 20);
        person.put("anjali", 21);
        person.put("ajay", 90);

        // key set 
        System.out.println("keys : "+person.keySet());

        // value set
        System.out.println("values : "+person.values());

        // mapping set 
        System.out.println("mapping set : "+person.entrySet());

        // remove()
        // System.out.println("before removing ajay : "+person);
        // person.remove("ajay");
        // System.out.println("removed ajay : "+person);

        // replace()
        System.out.println(person);
        System.out.println("replacing ram's value to 22 : "+person.replace("ram", 22));
        System.out.println(person);
        
        // contains 
        System.out.println("does sattu exist : "+person.containsKey("ram"));

    }
}
