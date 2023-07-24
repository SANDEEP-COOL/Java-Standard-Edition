import java.util.Queue;
import java.util.LinkedList;


public class LinkedListImplementation {
    public static void main(String[] args) {
        
        // LinkedList 
        Queue<Integer> q = new LinkedList<>();

        // offer 
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        // peek 
        // System.out.println("peek : "+q.peek());

        // poll 
        // System.out.println("poll : "+q.poll());
        // System.out.println(q);

        // element()
        // System.out.println("element : "+q.element());
        
    }
}
