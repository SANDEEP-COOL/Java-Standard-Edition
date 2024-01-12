import java.util.ArrayList;
import java.util.List;


public class ListToArray {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(1);
        list.add(30);

        Integer[] arr = list.toArray(new Integer[list.size()]);

        for(Integer i : arr) {
            System.out.println(i);
        }

    }

}
