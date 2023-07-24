
public class TryCatchFinally {

    public static void main(String[] args) {
        
        int arr[] = new int[]{10, 21, 34, 90,112};
        try{
            System.out.println(arr[98]);
        }

        // not a appropriate handeler 
        catch(NullPointerException n) {
            n.printStackTrace();
        }

        finally {
            System.out.println("finally");
        }

        // will not run 
        System.out.println("outside try-catch-finally");

    }
    
}
