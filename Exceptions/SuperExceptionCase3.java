class SuperClass{

    public void show() throws RuntimeException{
        System.out.println("show inside SuperClass");
    }

}

class ChildClass extends SuperClass {

    // Exception to RuntimeException - not compatible 
    // public void show() throws Exception {
    //     System.out.println("show inside childClass");
    // }

}

public class SuperExceptionCase3 {
    
    public static void main(String[] args) {
        
        ChildClass c = new ChildClass();
        c.show();

    }

}
