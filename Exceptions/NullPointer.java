public class NullPointer{
    public static void main(String[] args) {
        
        String str = null;
        try{
            System.out.println("str.lenght() : "+str.length());
        }
        catch(NullPointerException n) {
            System.out.println("str is null, can't determine length");
        }

    }
}