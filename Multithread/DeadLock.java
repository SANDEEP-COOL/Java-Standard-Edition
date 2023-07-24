
public class DeadLock extends Thread{

    public static void main(String[] args) {
        try{

            // currenty main thread is running 
    
            // below statement will say to main(),
            // hey main tum abhi wait karo kisi dusre thread ke complete hone ka,
            // uske baad execute ho jaanna
    
            // now since there is not any another thread,
            // that's why main method will keep waiting of another thread to be completed,
            // and this will cause of deadlock
            Thread.currentThread().join(5000);

            // After 1000 milliseconds, if the deadlock has not been resolved,
            // then interrupt the main thread and break the deadlock
            if (Thread.currentThread().isAlive()) {
                Thread.currentThread().interrupt();
                System.out.println("main thread continous...");
            }

        }
        catch(Exception e) {

        }
        
    }
    
}
