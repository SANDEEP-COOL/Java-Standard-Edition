class A{
    final void show(){
        System.out.println("Hello");
    }
}

class B extends A{
    // @Override - compilation error - final methods can't be overridden
    // final void show(){
    //     System.out.println("again hello");
    // }
}

public class FinalMethods {
    public static void main(String[] args) {
        
        B b = new B();
        b.show();
    }
}
