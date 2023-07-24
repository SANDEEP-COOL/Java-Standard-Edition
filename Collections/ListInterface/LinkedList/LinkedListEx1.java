package LinkedList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(19);
        list.add(3);
        list.add(76);
        list.add(13);

        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(2);
        
        System.out.println(list);
    }
}
