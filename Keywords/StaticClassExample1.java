
public class StaticClassExample1 {

    static int a = 10;
    int b = 20;

    // static class 
    static class NestedClass{

        // non-static - method 
        public static void disp() {

            // non static members - can be accessed - inside static method - but using object 
            StaticClassExample1 obj = new StaticClassExample1();

            // inside static class - we can only access static members of outer class 
            System.out.println(a);

            // accessing b - non static 
            System.out.println(obj.b);

        }

    }

    public static void main(String[] args) {
        
        // static class - can be called using Outer class 
        StaticClassExample1.NestedClass obj = new StaticClassExample1.NestedClass();
        StaticClassExample1.NestedClass.disp();

    }
}
