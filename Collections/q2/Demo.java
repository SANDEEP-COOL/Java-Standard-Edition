import java.util.*;
public class Demo {

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        // System.out.println(list.contains(10));
        // Collections.reverse(list);
        // System.out.println(list);
        // Integer[] arr = new Integer[list.size()];
        // list.toArray(arr);
        // Arrays.asList(arr);
        // System.out.println(arr);
        // for(Integer i : arr)
        //     System.out.println(i);
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(1000);
        hs.add(0);
        hs.add(1979);
        // Iterator<Integer> it = hs.iterator();
        // while(it.hasNext())
        //     System.out.println(it.next());
        // System.out.println(hs.contains(197));
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(10 , "A");
        hm.put(20 , "B");
        hm.put(30 , "C");
        // hm.clear();
        // System.out.println(hm.isEmpty());
        Set<Integer> keys = hm.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {

            System.out.println(it.next());

        }
        // HashMap<String, String> hm = new HashMap<>();
        // hm.put("a" , "b");
        // hm.put("c", "d");
        // System.out.println(hm);



    }

    
}
