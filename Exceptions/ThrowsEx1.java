
public class ThrowsEx1 {
    
    // if fun throws import ArithmeticException then it is mandatory that caller handel's it
    public static void fun() throws ArithmeticException{
        System.out.println(1/0);
    }

    public static void main(String[] args) throws ArithmeticException{
        
        fun();
        // System.out.println("main");

    }

}
