import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInDescendingOrder {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(19);
        numbers.add(30);
        numbers.add(2);

        System.out.println(numbers);
        
        Collections.sort(numbers, Collections.reverseOrder());
        
        System.out.println(numbers);

    }
}
