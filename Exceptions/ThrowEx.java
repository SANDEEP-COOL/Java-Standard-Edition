
public class ThrowEx {

    public static void fun() {
        try {
            // exception is not occurring but - throwing explicitly
            throw new NullPointerException();
        }
        // appropriate handeler 
        catch(NullPointerException n) {
            System.out.println("inside catch block");
            // again throw 
            throw n;
        }
    }

    public static void main(String[] args) {

        try {
            fun();
        }
        catch(NullPointerException n) {
            System.out.println("inside main");
        }

    }
}
