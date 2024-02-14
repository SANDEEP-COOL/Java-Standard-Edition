import java.util.*;

public class SortLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Character , Integer> lm = new LinkedHashMap<>();
        lm.put('A' , 1);
        lm.put('Z' , 2);
        lm.put('D' , 3);
        lm.put('E' , 3);
        lm.put('R' , 3);
        lm.put('F' , 3);
        System.out.println("Before Sorting...");
        for(Map.Entry<Character , Integer> e : lm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        
        System.out.println("After Sorting...");
        List<Map.Entry<Character , Integer>> list = new ArrayList<>(lm.entrySet());

        // Collections.sort(list , new Comparator<Map.Entry<Character , Integer>>(){
        //     public int compare(Map.Entry<Character , Integer> e1 , Map.Entry<Character , Integer> e2) {
        //         return e1.getKey() - e2.getKey(); 
        //     }
        // });

        // Collections.sort(list, (e1, e2) -> e1.getKey() - e2.getKey());
        TreeMap<Character , Integer> tm = new TreeMap<>(lm);
        for(Map.Entry<Character , Integer> e : tm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
