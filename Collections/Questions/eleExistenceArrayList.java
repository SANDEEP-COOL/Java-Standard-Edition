import java.util.ArrayList;

public class eleExistenceArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(30);
        al.add(20);

        System.out.println(al.contains(2000));

    }

}