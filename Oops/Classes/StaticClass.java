class Outer {

    public static void outerMethod() {

        System.out.println("inside outerMethod");
        
    }

    // static inner class 
    static class Inner {

        public static void innerMethod() {

            System.out.println("inside innerMethod");

        }

    }
    

}


public class StaticClass {

    public static void main(String[] args) {
        
        Outer.Inner.innerMethod();

    }
    
}
