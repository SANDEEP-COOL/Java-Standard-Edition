

public class ThreadStates implements Runnable{

    public static ThreadStates obj = null;
    public static Thread t1 = null;
    public static Thread t2 = null;

    @Override 
    public void run()  {
        try{
            Thread.sleep(4000);
            System.out.println("so ke jaag gaya h : t1 "+t1.getState());
            System.out.println("so ke jaag gaya h : t2 "+t2.getState());
        }
        catch(InterruptedException e) {
            
        }
    }


   public static void main(String[] args) {
    
     try{
         obj = new ThreadStates();
    
         // new - t1
         t1 = new Thread(obj);
         System.out.println("created : "+t1.getState());
         
         // runnable - t1
         System.out.println("/*/*/* t1");
         t1.start();
         
         // new - t2
         t2 = new Thread(obj);
         System.out.println("created : "+t2.getState());
         
         // runnable - t1
         System.out.println("/*/*/* t2");
         t2.start();
         
         // join 
         t1.join();

         t2.join();

     }
     catch(Exception e){

     }

   }

}
