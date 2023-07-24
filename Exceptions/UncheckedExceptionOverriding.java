
class SuperClass {

    public void fun() {
        System.out.println("inside fun of SuperClass!");
    }

} 

class ChildClass extends SuperClass{

    public void fun() throws ArithmeticException{
        System.out.println("inside fun of ChildClass");
    }

}

public class UncheckedExceptionOverriding {
    public static void main(String[] args) {
        
        ChildClass child = new ChildClass();
        child.fun();
        

    }
}
