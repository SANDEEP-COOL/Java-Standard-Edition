
interface In1{

    // after jdk 8 static method are allowed
    static void display(){

        System.out.println("display from static method of interface In1");

    }

}


public class StaticMethod {
    
    public static void main(String[] args) {
        
        // without implementing interface we can call it 
        In1.display();

    }

}
