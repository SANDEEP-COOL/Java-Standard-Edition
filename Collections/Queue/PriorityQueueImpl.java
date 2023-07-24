import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;

// comparator 
class CustomComparator implements Comparator<Integer> {
    @Override 
    public int compare(Integer num1, Integer num2) {
        
        int v = num1.compareTo(num2);

        if(v > 0) 
            return -1;
        else if(v < 0) 
            return 1;
        else 
            return 0;

    }

}


public class PriorityQueueImpl {
    public static void main(String[] args) {
        
        Queue<Integer>  q = new PriorityQueue<>(new CustomComparator());

        // offer 
        q.offer(100);
        q.offer(50);
        q.offer(30);
        q.offer(12);
        q.offer(70);

        System.out.println(q);

        // peek 
        // System.out.println("peek : "+q.peek());


        // poll 
        // System.out.println("poll : "+q.poll());
        // System.out.println(q);
        // System.out.println("poll : "+q.poll());
        // System.out.println(q);

        // remove()
        // System.out.println("remove 12: "+q.remove(12));
        // System.out.println(q);
        // System.out.println("peek : "+q.peek());

        // Iterator 
        // Iterator<Integer> it = q.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // contains 
        // System.out.println("contains : "+q.contains(12));

        // size 
        // System.out.println("size : "+q.size());

        // Integer[] arr = new Integer[(q.size())];
        // q.toArray(arr);
        // System.out.println("arr : "+Arrays.toString(arr));
        
    }
}
