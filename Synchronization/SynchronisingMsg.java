import java.io.*;
import java.util.*;

// A Class used to send a message
class Sender {
    public void send(String msg) {
        System.out.println("sending\t"+msg);
        try{
            Thread.sleep(2000);
        }
        catch(Exception e) {

        }
        System.out.println("sent!");
    }
}

// Class for send a message using Threads 
class ThreadSender extends Thread {
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadSender(String m, Sender obj) {
        this.msg = m;
        this.sender = obj;
    }

    public void run(){
        // Only one thread can send a message
        // at a time.
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

public class SynchronisingMsg{

    public static void main(String[] args) {
        
        Sender send = new Sender();

        ThreadSender S1 = new ThreadSender(" Hi ", send);
        ThreadSender S2 = new ThreadSender(" Bye ", send);
 
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

    }
    
}
