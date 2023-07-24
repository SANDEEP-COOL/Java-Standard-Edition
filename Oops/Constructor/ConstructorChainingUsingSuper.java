class Base{
    String name;

    Base(){
        this("");
        System.out.println("Non-paramatraized constructor of base class");    
    }

    Base(String name) {

        this.name = name;
        System.out.println("paramatraized constructor of base class");

    }
}

class Derived extends Base {

    Derived(){
        System.out.println("Non-paramatraized constructor in derived class");
    }

    Derived(String name){

        // invoking super class constructor 
        super(name);
        System.out.println("paramatrazied constructor in derived class");

    }

}

public class ConstructorChainingUsingSuper {
    public static void main(String []args) {

        Derived obj = new Derived("sandeep");

    }
}
