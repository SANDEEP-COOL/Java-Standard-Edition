class SuperClass{

    public void show() throws Exception{
        System.out.println("show inside SuperClass");
    }

}

class ChildClass extends SuperClass {

    // RuntimeException to Exception - compatible 
    public void show() throws RuntimeException {
        System.out.println("show inside childClass");
    }

}

public class SuperExceptionCase2 {
    
    public static void main(String[] args) {
        
        ChildClass c = new ChildClass();
        c.show();

    }

}
