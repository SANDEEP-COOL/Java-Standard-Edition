class Demo {

    public void show() {
        System.out.println("super class show method");
    }

}

class ChildDemo{

    // an anonymous class having Demo as Parent class
    static Demo d = new Demo() {

        @Override 
        public void show() {

            super.show();
            System.out.println("child class show method");

        }

    };

}


public class AnonymousClass {
    public static void main(String[] args) {
        
        ChildDemo.d.show();

    }
}
