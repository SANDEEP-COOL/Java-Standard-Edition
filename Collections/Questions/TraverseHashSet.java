import java.util.HashSet;
import java.util.Iterator;

public class TraverseHashSet {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(30);
        set.add(5);
        set.add(1);
        set.add(1000);
        set.add(3);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {

            System.out.print(it.next()+" ");

        }

    }

}
