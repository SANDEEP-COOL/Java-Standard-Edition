import java.util.List;


public class ArrayToList {
    public static void main(String[] args) {
        
        Integer[] arr = new Integer[]{120, 30, 40, 2};

        List<Integer> list = java.util.Arrays.asList(arr);
 
        System.out.println(list);
    }
}
