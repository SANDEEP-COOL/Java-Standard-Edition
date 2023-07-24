import java.io.IOException;
class SuperClass{

    // checked exception - needs to be handeled 
    public void show() throws IOException{
        System.out.println("show inside SuperClass");
    }

}

class ChildClass extends SuperClass {

    public void show() {
        System.out.println("show inside childClass");
    }

}

public class SuperExceptionCase5 {
    
    public static void main(String[] args) {
        
        SuperClass s = new SuperClass();

        // not handeling - IOException - checkedException - will generate compilation error,
        // for not getting compilation error,
        // either you handle it,
        // or you notify be compiler using throws keyword that i don't wanna handle
        s.show();

    }

}
