import java.util.ArrayList;

public class AddEleAtIndexArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(30);
        al.add(25);

        
        System.out.println(al);


        al.add(1, 100);

        System.out.println(al);
    }
}
