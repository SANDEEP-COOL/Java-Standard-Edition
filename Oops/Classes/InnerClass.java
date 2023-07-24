class Outer {

    class Inner{

        // instance method
        public void show() {
            System.out.println("show inside inner class");
        }

        // We can not have a static method in a nested inner class because an inner class is implicitly associated with an object of its outer class so it cannot define any static method for itself.
        // public static void show1() {
        //     System.out.println("static show inside inner class");
        // }

    }

}
public class InnerClass {

    public static void main(String[] args) {

        Outer.Inner in = new Outer().new Inner();
        in.show();

    }   
    
}
