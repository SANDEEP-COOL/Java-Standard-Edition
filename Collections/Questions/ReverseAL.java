import java.util.ArrayList;
import java.util.Collections;

public class ReverseAL {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Collections.reverse(al);

        System.out.println(al);


    }
}
