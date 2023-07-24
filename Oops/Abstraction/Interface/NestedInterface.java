class A{
    // NESTED INTERFACE 
    // by default - public and default and protecetd,
    // can't be private
    protected interface B{
        void show();
    }
}

class B implements A.B{

    @Override
    public void show(){
        System.out.println("inside B class show method");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        
        B b = new B();
        b.show();

    }
}
