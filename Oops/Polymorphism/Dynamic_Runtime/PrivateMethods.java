class A{

    // this method will not be inherited by any other child class 
    private void fun(){
        System.out.println("fun from A");
    }

    public void hello(){
        fun();
    }
}

class B extends A{

    // now since fun is private that's why it can't be inherited,
    // that's why can't be overridde
    // @Override - error  
    // private void fun(){
    //     System.out.println("fun from B");
    // }

    // ye B ki khud ki method h , A ki fun method nahi hai vo inherit ho hi ni sakti 
    private void fun(){
        System.out.println("fun from B");
    }
}

public class PrivateMethods {
    public static void main(String[] args) {
        
        A a = new A();

        // since fun is private , can't be accessed from outside of class 
        // a.fun();

        // calling public method then that public method will call to private fun()
        a.hello();
    }
}
