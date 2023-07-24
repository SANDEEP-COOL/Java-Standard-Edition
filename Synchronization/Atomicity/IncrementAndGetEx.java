import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

class MyThread extends Thread{

    // atomic vairiable 
    // private AtomicInteger count = new AtomicInteger();
    int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
               
                // putting  thread on sleep
                Thread.sleep(4000);
               
                System.out.print("name : "+Thread.currentThread().getName()+" ");

                // calling incrementAndGet() methodIncrementAndGetEx
                // on count variable
                // count.incrementAndGet();
                count++;
                System.out.print("count : "+count+" ");
            }
            catch (InterruptedException e) {
               
                // throwing exception
                System.out.println(e);
            }
        }

    }

    // returning the count value
    // public AtomicInteger getCount() { return count; }
    public int getCount() { return count; }
}

public class IncrementAndGetEx{
    public static void main(String[] args) {
        
        // creating an thread object
        MyThread t = new MyThread();

        // thread1
        Thread t1 = new Thread(t, "A");

        // thread2 
        Thread t2 = new Thread(t, "B");

        t1.start();
        t2.start();

        // start 
        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // displaying the count
        System.out.println("count=" + t.getCount());

    }
}

