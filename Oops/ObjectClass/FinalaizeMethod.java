
public class FinalaizeMethod {
    public static void main(String[] args) {
        
        FinalaizeMethod t = new FinalaizeMethod();
        t = null;

        // calling garbage collector 
        System.gc();

        System.out.println("end");
    }

    @Override 
    protected void finalize() {
        System.out.println("finilaize method called");
    }
}
