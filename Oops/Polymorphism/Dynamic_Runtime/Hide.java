class Base {

    // instance method 
    // void fun1(){
    //     System.out.println("fun1 from Base");
    // }
    
    // static method can't be overridden
    // static void fun1(){
    //     System.out.println("fun1 from Base");
    // }

    // static method will be overridden as static in child case , so method will be called of object 
    static void fun1(){
        System.out.println("fun1 from Base");
    }

}

class Derived extends Base{

    // overridding instance method
    // @Override 
    // void fun1(){
    //     System.out.println("fun1 from Derived");
    // }

    //  overridding instance method, but made static
    // @Override 
    // static void fun1(){
    //     System.out.println("fun1 from Derived");
    // }

    // overriding base class static method , so method of base class will run , either it is child class object or base class object 
    // @Override - error 
    static void fun1(){
        System.out.println("fun1 from Base");
    }

}

public class Hide {
    
    public static void main(String[] args) {
        
        Base b = new Derived(); 

        // Derived class fun1 runs 
        b.fun1();

    }

}
