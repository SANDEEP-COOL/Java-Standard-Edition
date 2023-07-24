class SuperClass{

    // RuntimeException - unchecked exception  - that's why no issue with this
    public void show() throws RuntimeException{
        System.out.println("show inside SuperClass");
    }

}

class ChildClass extends SuperClass {

    public void show() {
        System.out.println("show inside childClass");
    }

}

public class SuperExceptionCase4 {
    
    public static void main(String[] args) {
        
        ChildClass c = new ChildClass();
        c.show();

    }

}
