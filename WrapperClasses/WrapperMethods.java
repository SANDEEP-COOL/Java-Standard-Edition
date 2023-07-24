
public class WrapperMethods {
    public static void main(String[] args) {
        
        Float floatobj = 45.85f;
        int floatToInt = floatobj.intValue();
        System.out.println("floatToInt : "+floatToInt);

        System.out.println("binaryToInteger : "+Integer.valueOf("101", 2));

    }
}
