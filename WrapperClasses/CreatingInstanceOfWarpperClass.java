
public class CreatingInstanceOfWarpperClass {
    
    public static void main(String args[]) {
        
        // num1 points to different object, 
        // num2 points to different object 
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        // num3 and num4 points to same object 
        Integer num3 = Integer.valueOf(30);
        Integer num4 = Integer.valueOf(30);

        boolean value1 = (num1 == num2);
        boolean value2 = (num3 == num4);


        System.out.println("num1 == num2 : "+value1);
        System.out.println("num3 == num4 : "+value2);

        Integer num5 = 50;
        Integer num6 = 50;

        System.out.println("num5 == num6 : "+(num5 == num6));
        
    }

}
