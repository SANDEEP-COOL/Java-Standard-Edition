

public class ControllingMainThread extends Thread{
    public static void main(String[] args) {
        
        // main thread
        Thread main = Thread.currentThread();

        // name 
        System.out.println("name : "+main.getName());

        // change name 
        System.out.println("new name : "+main.getName());
        

    }
}
