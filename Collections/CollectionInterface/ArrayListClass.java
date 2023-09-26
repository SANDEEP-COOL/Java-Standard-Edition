import java.lang.reflect.Array;
import java.util.*;

public class ArrayListClass {
    
    public static void main(String[] args) {
        
        // ArrayList<String> al = new ArrayList<>();
        // al.add("jhon");
        // al.add("bob");
        // al.add(0, "arzav");
        // System.out.println(al.get(0));
        // // for(String str : al) {
        // //     System.out.println(str);
        // // }
        // // al.set(0, "arnav");
        // // System.out.println(al);
        // al.remove(0);
        // System.out.println(al);

        // ArrayList<Integer> al = new ArrayList<>();

        // al.add(10);
        // al.add(50);
        // al.add(25);
        // al.add(20);
        // al.add(3);
        // al.add(8);
        // al.add(7);
        // al.add(4);

        // Integer[] arr = new Integer[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
        // System.out.println(al1);

        // al.sort(Comparator.naturalOrder());
        // System.out.println(al);
        // al.sort(Comparator.reverseOrder());
        // System.out.println(al);

        // Integer[] arr = new Integer[al.size()];

        // al.toArray(arr);

        // for(Integer i : arr) 
        //     System.out.println(i);

        // String str = al.toString();
        // System.out.println(str);

        // ArrayList<Integer> cloneNumber = (ArrayList<Integer>)al.clone();
        // System.out.println(cloneNumber);

        // System.out.println(al.indexOf(7));

        // System.out.println(al.isEmpty());

        // Iterator<Integer> it = al.iterator();
        // while(it.hasNext()) {

        //     System.out.println(it.next());

        // }

        // al.sort();

        // System.out.println(al);
        // al.clear();
        // System.out.println(al);


        // ArrayList<String> al = new ArrayList<>();
        // al.add("java");
        // al.add("C++");
        // al.add("C");
        // al.add("Python");

        // ArrayList<String> programmingLanguages = new ArrayList<>();
        // programmingLanguages.addAll(al);
        // System.out.println(programmingLanguages);


        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("a" , 1);
        // hm.put("b" , 2);
        // hm.put("c" , 3);
        // hm.put("d" , 4);
        // hm.put("e" , 5);

        

        // for(Integer i : hm.values())
        //     System.out.println(i);

        // System.out.println(hm.values());
            
        // System.out.println(hm.keySet());

        // for(String key : hm.keySet())   
        //     System.out.println(key);

        // System.out.println(hm.entrySet());

        // for(Map.Entry<String, Integer> e : hm.entrySet()) {

        //     System.out.println(e);

        // }

        // System.out.println(hm.containsValue(1));

        // System.out.println(hm.get("d"));
        
        // System.out.println(hm.containsKey("d"));

        // key 
        // hm.remove("a");
        // System.out.println(hm);
        
        // // value 
        // hm.remove(2);
        // System.out.println(hm);
        
        // // mapping 
        // hm.remove("e", 5);
        // System.out.println(hm);


        // hm.put("e" , 51);
        // System.out.println(hm);
        // hm.clear();
        // System.out.println(hm.isEmpty());

        // HashMap<String, Integer> chm = (HashMap<String, Integer>)hm.clone();
        // System.out.println(chm);


        // HashMap<String, Integer> primeNumbers = new HashMap<>();
        // primeNumbers.put("two",2);
        // primeNumbers.put("three",3);

        // HashMap<String, Integer> numbers = new HashMap<>();
        // numbers.put("hundred", 100);
        // numbers.put("seven", 7);
        // numbers.put("three", 13);

        // numbers.putAll(primeNumbers);
        // System.out.println(numbers);


        // SortedMap<Integer, String> sm = new TreeMap<>();

        // sm.put(5 , "one");
        // sm.put(4 , "two");
        // sm.put(3 , "three");
        // sm.put(2 , "four");
        // sm.put(1 , "five");

        // System.out.println(sm.comparator());
        // System.out.println(sm.firstKey());
        // System.out.println(sm.lastKey());

        // TreeMap<String , Integer> tm = new TreeMap<>();
        
        // tm.put("b" , 2);
        // tm.put("c" , 3);
        // tm.put("d" , 4);
        // tm.put("a" , 1);

        // System.out.println(tm.firstKey());
        // System.out.println(tm.firstEntry());
        // System.out.println(tm.lastKey());
        // System.out.println(tm.lastEntry());
        // System.out.println(tm.size());
        // tm.clear();
        // System.out.println(tm);

        // TreeMap<String, Integer> tmCloned = (TreeMap<String, Integer>)tm.clone();
        // System.out.println(tmCloned);

        // System.out.println(tm.containsKey("d"));
        // System.out.println(tm.containsValue(1));

        // System.out.println(tm);
        // Integer x = tm.remove("d");
        // System.out.println(x+" removed");
        // System.out.println(tm);

        // System.out.println(tm);
        // tm.put("d", 100);
        // System.out.println(tm);

        // System.out.println(tm.get("d"));

        // TreeMap<String, Integer> tm1 = new TreeMap<>();
        // tm1.put("e" , 5);
        // tm1.put("f" , 6);
        // tm1.put("g" , 7);
        // tm1.put("h" , 8);

        // tm.putAll(tm1);

        // Set<Map.Entry<String, Integer>> entrySet = tm.entrySet();
        // Set<String> keySet = tm.keySet();
        // Collection<Integer> values = tm.values();

        // System.out.println(values);
            
        // System.out.println(tm);
        // System.out.println(tm1);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(50);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(390);

        // set2.retainAll(set);
        // System.out.println(set2);
        System.out.println(set.containsAll(set2));

        // Integer[] arr = new Integer[set.size()];
        // set.toArray(arr);
        // for(int i : arr)
        //     System.out.print(i+" ");
        // System.out.println(set.contains(10));
        // System.out.println(set.hashCode());
            
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(400);
        // al.add(20);
        // al.add(30);

        // Set<Integer> set2 = new HashSet<>();
        // set2.addAll(al);
        // // System.out.println(set2);
        // // set2.remove(400);
        // // set2.clear();
        // System.out.println(set2.size());
        // Iterator<Integer> it = set2.iterator();
        // while(it.hasNext())
        //     System.out.println(it.next());
    }

}
