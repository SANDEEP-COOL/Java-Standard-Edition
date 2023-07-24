// data members can't be overridden  
class A{
    int x = 10;
}

class B extends A {
    int x = 20;
}
public class DataMembers {

    public static void main(String[] args) {
        
        A a = new B();
        System.out.println("a.x = "+a.x);
        a = new A();
        System.out.println("a.x = "+a.x);
        
        B b = new B();
        System.out.println("b.x = "+b.x);


    }

}
