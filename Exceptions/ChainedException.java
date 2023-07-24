
public class ChainedException {
    public static void main(String[] args) {
        
        // Throwable class - getCause() - initCause(Throwable obj)
        try{
            NumberFormatException nfm = new NumberFormatException();

            // setting our own cause 
            nfm.initCause(new NullPointerException("This is actuall cause of Exception!"));

            throw nfm;
        }
        catch(NumberFormatException nfm) {

            // original cause 
            System.out.println(nfm);

            // our own cause 
            System.out.println(nfm.getCause());

        }

    }
}
