
public class ThreadPriority extends Thread{

    @Override 
    public void run() {
        try{

            System.out.println("inside run method : "+Thread.currentThread().getName());

        }
        catch(Exception e) {

        }
    }

    public static void main(String[] args) {
        

        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        System.out.println("t1 : "+t1.getPriority()+" , t2 : "+t2.getPriority() +" , t3 : "+t3.getPriority());
        
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(2);
        
        System.out.println("t1 : "+t1.getPriority()+" , t2 : "+t2.getPriority() +" , t3 : "+t3.getPriority());


        System.out.println("main : "+Thread.currentThread().getPriority());
        
        Thread.currentThread().setPriority(10);
        
        System.out.println("main : "+Thread.currentThread().getPriority());

    }
}
