class ThreadDemoRunnable implements Runnable {


        @Override 
        public void run(){
            try{

                System.out.println("thread "+Thread.currentThread().getId());
            }
            catch(Exception e){

            }
        }

}

public class RunnableInterfaceEx1 {
    public static void main(String[] args) {
        
        int n = 8;
        for(int i = 0 ; i < n ; i++) {
            Thread t = new Thread(new ThreadDemoRunnable());
            t.start();
        }

    }
}
