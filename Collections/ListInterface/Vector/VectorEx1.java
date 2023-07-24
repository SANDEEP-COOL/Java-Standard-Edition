import java.util.Vector;
import java.util.Iterator;
import java.util.Arrays;

public class VectorEx1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Vector<String> mammals = new Vector<>();

        // add()
        mammals.add("Dog");
        mammals.add("Horse");

        // add(index, ele) 
        mammals.add(1, "Cat");

        Vector<String> animals = new Vector<>();

        animals.add("Crocodile");

        // addAll()
        mammals.addAll(animals);

        System.out.println("mammals : "+mammals);

        // get(index)
        System.out.println("mammals[2] : "+mammals.get(2));

        // Iterator
        Iterator<String> iterate = mammals.iterator();
        System.out.println("using iterator");
        while(iterate.hasNext()) {
            System.out.print(iterate.next()+" ");
        }
        System.out.println();

        // remove()
        System.out.println("mammals[1] : "+mammals.get(1)+" is removed : "+mammals.remove(1));
        System.out.println(mammals);

        // set()
        mammals.set(0, "cat");
        System.out.println("index 1 ele has been changed by cat");
        System.out.println(mammals);

        // size() 
        System.out.println("size of mammals is : "+mammals.size());

        // toArray()
        String[] arr = new String[mammals.size()];
        mammals.toArray(arr);
        System.out.println("arr : "+Arrays.toString(arr) +" length "+arr.length);

        // toString()
        System.out.println(mammals.toString());

        // contains 
        System.out.println(mammals.contains("sandeep"));
    }
}
