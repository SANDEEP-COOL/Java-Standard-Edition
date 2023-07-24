import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Comparator;

public class ArrayListAllMethods {
    public static void main(String[] args) {
        
        ArrayList<String> languages = new ArrayList<>();

        // add()
        languages.add("C");
        languages.add("Java");
        languages.add("python");
        languages.add("languages");
        languages.add("english");
        languages.add("bhojpuri");

        // add(index)
        languages.add(1, "js");

        // addAll()
        HashSet<String> students = new HashSet<>();
        students.add("ram");
        students.add("shyam");
        languages.addAll(students);

        System.out.println(languages);

        // get(index)
        System.out.println(languages.get(2));

        // Iterator 
        Iterator<String> iterator = languages.iterator();
        System.out.println("using Iterator!");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // set(index, ele)
        languages.set(4, "pooja");

        System.out.println(languages);

        // remove(ele)
        languages.remove("pooja");
        System.out.println(languages);

        // remove(index) 
        languages.remove(2);
        System.out.println(languages);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        // list.remove(10); - arrayIndexOutOfBoundException - taking 10 as primitive as index not as list ele
        list.remove(Integer.valueOf(10)); //taking 10 as Object object 
        System.out.println(list);
        
        // removeAll 
        // ArrayList<String> arrayList1 = new ArrayList<>();
        // arrayList1.add("C");
        // arrayList1.add("java");
        // arrayList1.add("C++");
        // arrayList1.add("js");
        // arrayList1.add("python");

        // ArrayList<String> arrayList2 = new ArrayList<>();
        // arrayList2.add("C++");
        // arrayList2.add("C");

        // System.out.println(arrayList1);
        // arrayList1.removeAll(arrayList2);
        // System.out.println(arrayList1);

        // clear()
        // arrayList1.clear();
        // System.out.println(arrayList1); 

        // size()
        // System.out.println(languages.size());

        // sort()
        // System.out.println("before sort : "+languages);
        // languages.sort(Comparator.naturalOrder()); //descending to ascending
        // languages.sort(Comparator.reverseOrder()); //ascending to descending
        // System.out.println("after sort : "+languages);

        // clone()
        // ArrayList<String> languageColne = (ArrayList<String>)languages.clone();
        // System.out.println("clone : "+languageColne);
        // System.out.println("printing clone : "+languages.clone());

        // contains()
        // System.out.println("languages : "+languages);
        // System.out.println("Js containes : "+languages.contains("jcsjhvbs"));

        // ensureCapacity()
        // ArrayList<Integer> ar1 = new ArrayList<>();
        // ar1.ensureCapacity(2);
        // ar1.add(10);
        // ar1.add(20);
        // ar1.add(30);
        // ar1.add(40);
        // System.out.println("ar1 : "+ar1);

        // isEmpty()
        // System.out.println("languages : "+languages.isEmpty());
        // languages.clear();
        // System.out.println("languages : "+languages.isEmpty());

    }
}
