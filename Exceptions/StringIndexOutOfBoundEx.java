
public class StringIndexOutOfBoundEx {
    public static void main(String[] args) {
        
        String str = "sandeep";
        try{
            System.out.println("charAt(1) : "+str.charAt(10));
        }
        catch(StringIndexOutOfBoundsException s) {
            System.out.println("no charcter exist there!");
        }

    }
}
