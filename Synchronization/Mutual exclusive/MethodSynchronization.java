class PrintTest {
    synchronized public void printThread(int n) {

        // This loop will print the  currently executed
        // thread
        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("Thread "+n+" is working");
            try{
                Thread.sleep(2000);
            }   
            catch(Exception e) {

            }
        }

        // Display message for better readability
        System.out.println("--------------------------");

         try{
                Thread.sleep(4000);
        }   
        catch(Exception e) {

        }

    }
}

class Thread1 extends Thread {
    PrintTest test = null;

    Thread1(PrintTest p) { test = p; };

    public void run()
    {
        // Calling method  1 as in above class
        test.printThread(1);
    }
}

class Thread2 extends Thread {
    PrintTest test = null;
    Thread2(PrintTest p) { test = p; };
    public void run()
    {
        // Calling method  1 as in above class
        test.printThread(2);
    }
}

public class MethodSynchronization {
    public static void main(String[] args) {
        
        PrintTest p = new PrintTest();
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);

        t1.start();
        t2.start();

    }
}
