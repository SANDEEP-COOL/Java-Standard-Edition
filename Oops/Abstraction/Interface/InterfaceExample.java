interface InterfaceOne{

    // public, static, final - by default
    int a = 10;

    // public , abstract - by default 
    void display();

}

public class InterfaceExample implements InterfaceOne{

    @Override 
    public void display(){

        System.out.println("value of a is : "+a);

    }

    public static void main(String[] args) {
        
        // InterfaceOne in = new InterfaceExample();
        // in.display();

        InterfaceOne ref; 
        ref = new InterfaceExample();

    }
    
}
