import java.util.HashSet;


public class eleExistenceHashSet {

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(21);
        set.add(30);
        set.add(15);

        System.out.println(set.contains(30));
    }

}