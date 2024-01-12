import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {

    public static void main(String[] args) {
        
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(40);
        al.add(1);

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {

            System.out.print(it.next()+" ");

        }

    }
    
}
