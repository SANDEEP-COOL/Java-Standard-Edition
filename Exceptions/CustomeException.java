
class MyException extends Exception{

    String exception;

    public MyException(String s) {
        // calling constructor of Exception 
        // super(s);
        this.exception = s;
    }
    @Override 
    public String getMessage() {
        return this.exception;
    }
}

public class CustomeException {
    public static void main(String[] args) {
        
        try{
            throw new MyException("sandeep");
        }
        catch(MyException m) {
            System.out.println(m.getMessage());
        }

    }
}
