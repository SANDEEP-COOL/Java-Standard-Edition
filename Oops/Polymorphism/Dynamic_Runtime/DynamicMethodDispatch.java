class A{

    void meth1(){
        System.out.println("meth1 inside A class");
    }

}

class B extends A{

    @Override
    void meth1(){
        System.out.println("meth1 inside B class");
    }

}

class C extends A{

    @Override 
    void meth1(){
        System.out.println("meth1 inside C class");
    }

}


public class DynamicMethodDispatch {
    
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();

        // A type reference 
        A ref;

        // ref refers to A object 
        ref = a;

        // meth1 - A 
        ref.meth1();

        // ref refers to B object
        ref = b;

        // meth1 - B 
        ref.meth1();

    }

}
