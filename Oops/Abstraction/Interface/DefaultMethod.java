interface In1{

    public void come();
    public void goOut();
    public void firstComeThenGo();

    // default , this will not stop the older class to be excuted without implementing this method
    // after jdk 8
    default void display(){
        System.out.println("default method added");
    }
}

public class DefaultMethod implements In1{
    
    public void come(){

        System.out.println("Come");

    }

     public void goOut(){

        System.out.println("go");

    }

    public void firstComeThenGo(){

        System.out.println("firstComeThenGo");

    }
    
    public static void main(String[] args) {
        
        DefaultMethod dm = new DefaultMethod();
        dm.display();

    }

}
