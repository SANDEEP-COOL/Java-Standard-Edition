import java.util.List;
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("ram");
        list.add("shyam");
        list.add("abhi");
        list.add("anil");
        list.add("guru");

        System.out.println("get(2) : "+list.get(2));

        list.remove("ram");

        System.out.println(list);

    }
}