// IMP - DEFAULT CONSTRUCTOR JAVA KE DWARA ONLY TAB ADD KIYA JATA HAI JAB US CLASS ME KOI BHI CONSTRUCTOR NI HAI
// CHILD CLASS KE KISI BHI CONSTRUCTOR ME JAVA BY DEFAULT super() ADD KAR DETI HAI 

// abstract class Base{

//     // compiler has added default constructor 
//     // Base(){

//     // }

//     abstract void fun();
// }

// class Child extends Base{

//     // compiler has added default constructor 
//     // Child(){
//         // since Child is CHILD CLASS of Base , 
//         // that's why firstly BASE class constructor must run ,
//         // that's why compiler will by default add calling statement for default constructor of BASE

//         // super() - added by compiler
//     // }

//     void fun(){
//         System.out.println("fun of child");
//     }
// }

// public class ConstructorInAbstractClass {
//     public static void main(String[] args) {
        
//         Child child = new Child();
//         child.fun();

//     }
// }


// abstract class Base{

//     // now , since we add non-paramatraized constructor so compiler will not add the default constructor 
//     Base(){
//         System.out.println("Base class constructor");
//     }

//     abstract void fun();
// }

// class Child extends Base{

//     // here, compiler will add default constructor 
//     // Child(){
//         // super() - added by compiler 
//     // }

//     void fun(){
//         System.out.println("fun of child");
//     }
// }

// public class ConstructorInAbstractClass {
//     public static void main(String[] args) {
        
//         Child child = new Child();
//         child.fun();

//     }
// }


// abstract class Base{

//     // mandatory 
//     Base(){
//         System.out.println("Base class constructor");
//     }

//     // now , since we add paramtraized constructor so compiler will not add the default constructor 
//     Base(int x){
//         System.out.println("Base class constructor with x");
//     }

//     abstract void fun();
// }

// class Child extends Base{

//     Child(){
//         // super(); added by compiler , now we must make a non-paramtraized constructor in the parent class as well
//     }

//     void fun(){
//         System.out.println("fun of child");
//     }
// }

// public class ConstructorInAbstractClass {
//     public static void main(String[] args) {
        
//         Child child = new Child();
//         child.fun();

//     }
// }


// here you implemented all things from your side 
abstract class Base{

    // since we have implemented constructor , so java will not add default constructor 
    Base(){
        System.out.println("Base class constructor");
    }

    Base(int x){
        System.out.println("Base class constructor with x");
    }

    abstract void fun();
}

class Child extends Base{

    Child(){
        // super(100); since we have added super(100), java will not add super()
    }

    void fun(){
        System.out.println("fun of child");
    }
}

public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.fun();

    }
}
