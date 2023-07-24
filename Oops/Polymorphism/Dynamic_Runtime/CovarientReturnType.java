class A{

    // if it is overriden by child class,
    // then return type can either be same or, 
    // it subtype
    public Object returnObject() {
        return new Object();
    }
}

class B extends A{

    @Override 
    public String returnObject() {
        return "string";
    }

}
public class CovarientReturnType {
    public static void main(String[] args) {
        
        A a = new B();
        System.out.println(a.returnObject());
        
        a = new A();
        System.out.println(a.returnObject());

    }
}
