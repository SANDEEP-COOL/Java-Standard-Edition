class A {
    
    // OVERLOADING
    void printString(String str) {
        System.out.println(str);
    }

    void printString(String str, int num) {
        System.out.println(str+" , "+num); 
    }

}

class B extends A {


    // OVERRIDING 
    @Override 
    void printString(String str) {

        System.out.println(str +" from class B");

    }

}
public class MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        
        // A a = new A();
        // a.printString("sandeep", 100);
        // a.printString("patel");

        // B b = new B();
        // b.printString("sandep");

        // A a = new A();
        // a.printString("sandeep");
        // a.printString("sandeep", 100);

    }
}
