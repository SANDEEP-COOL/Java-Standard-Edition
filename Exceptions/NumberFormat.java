
public class NumberFormat {
    public static void main(String[] args) {
        
        String str = "sandeep";
        try{
            int i = Integer.parseInt("str");
        }
        catch(NumberFormatException n) {
            System.out.println("can't convert into number!");
        }

    }
}
