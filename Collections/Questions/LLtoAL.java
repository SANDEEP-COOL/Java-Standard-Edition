import java.util.LinkedList;
import java.util.ArrayList;


public class LLtoAL {
    public static void main(String[] args) {
        

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);

        // METHOD1 
        // Integer[] array = ll.toArray(new Integer[ll.size()]);

        // ArrayList<Integer> al = new ArrayList<>();

        // for(Integer i : array) {
        //     al.add(i);
        // }

        // System.out.println(al);

        // METHOD2
        ArrayList<Integer> al = new ArrayList<>(ll);

        System.out.println(al);

    }
}
