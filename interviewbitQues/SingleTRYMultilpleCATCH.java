
public class SingleTRYMultilpleCATCH {
    public static void main(String[] args) {
        
        try{

            // WILL GENERATE NUMBERFORMAT EXCEPTION 
            Integer num = Integer.parseInt("sandeep");

            // int[] arr = new int[] {10, 20};

            // WILL GENERATE ArrayIndexOutOfBoundsException

            System.out.println(arr[100]);

        }
        catch(NumberFormatException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    
    }
}
