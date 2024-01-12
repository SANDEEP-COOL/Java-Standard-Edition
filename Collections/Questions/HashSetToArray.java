import java.util.HashSet;


public class HashSetToArray {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(5);
        set.add(15);

        Integer[] array = set.toArray(new Integer[set.size()]);

        for(Integer i : array) {
            System.out.println(i);
        }
 
    }
}
