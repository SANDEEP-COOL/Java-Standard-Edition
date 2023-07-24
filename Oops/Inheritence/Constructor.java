class Base{

    Base(){

        System.out.println("Base class constructor");

    }

    Base(int x){
        System.out.println("x = "+x);
    }

}

class Derived extends Base{


    Derived(){

        // super() - byDefault
        System.out.println("Derived class constructor");

    }
    
    Derived(int x){

        // super() - byDefault
        super(x);
        System.out.println("Derived class constructor");

    }
    

}


public class Constructor {

    public static void main(String[] args) {
        
        // Derived d = new Derived();
        Derived d = new Derived(100);

    }
    
}
