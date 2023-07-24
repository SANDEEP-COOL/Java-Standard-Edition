class Outer {
    
    public void outerMethod() {

        int x = 100;

        System.out.println("inside outer method");

        // inner class inside - outer method 
        class Inner {

            private void innerMethod() {
                System.out.println("inside inner method x = "+x);
            }

        }

        // object - inner class 
        Inner in = new Inner();

        in.innerMethod();

    }

}

public class InnerClassEx2 {
    public static void main(String[] args) {
        
        Outer out = new Outer();
        out.outerMethod();

    }
}
