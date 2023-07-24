import java.io.*;

class Test {

    synchronized void fun(int n) {

        // synchronized method 
        System.out.println("n : "+n);

        try{

            Thread.sleep(4000);
        }
        catch(Exception e) {

        }

    }

}

public class SynchronisingUsingAnonymousClass {

    public static void main(String[] args) {
        
         // only one object
         final Test obj = new Test();
 
         Thread a = new Thread() {
             public void run() { obj.fun(15); }
         };
  
         Thread b = new Thread() {
             public void run() { obj.fun(30); }
         };
  
         a.start();
         b.start();

    }
    
}
