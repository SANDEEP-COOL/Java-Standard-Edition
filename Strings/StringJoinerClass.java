import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");

        // StringJoiner object 
        StringJoiner joiner1 = new StringJoiner(",");
        System.out.println("joiner1 : "+joiner1);
        
        // using add 
        joiner1.add(al.get(0)).add(al.get(1));
        System.out.println("joiner1 after modification : "+joiner1);
        
        // length 
        System.out.println(joiner1.length());
        
        // joiner2 
        StringJoiner joiner2 = new StringJoiner(":");
        System.out.println("joiner2 : "+joiner2);
        
        
        // add 
        joiner2.add(al.get(2)).add(al.get(3));
        System.out.println("joiner2 after modification : "+joiner2);


    }
}
