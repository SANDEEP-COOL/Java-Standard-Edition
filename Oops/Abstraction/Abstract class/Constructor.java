abstract class Base{

    Base(){
        System.out.println("Base class constructor");
    }

    abstract void fun();
}

class Derived extends Base{

    Derived(){
        System.out.println("Derived class constructor");
    }

    @Override 
    public void fun(){
        System.out.println("fun() implementation in Derived class");
    }

}


public class Constructor {

    public static void main(String[] args) {
        
        Derived d = new Derived();
        d.fun();

    }

}
