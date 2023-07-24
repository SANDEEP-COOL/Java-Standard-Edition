class SuperClass{

    public void show() throws ArithmeticException{
        System.out.println("show inside SuperClass");
    }

}

class ChildClass extends SuperClass {

    public void show() throws NullPointerException {
        System.out.println("show inside childClass");
    }

}

public class SuperExceptionCase1 {
    
    public static void main(String[] args) {
        
        ChildClass c = new ChildClass();
        c.show();

    }

}
