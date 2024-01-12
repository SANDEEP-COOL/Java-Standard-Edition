
public class OverloadingOfMainMethod {
    public static void main(String[] args) {
        
        System.out.println("hello");
        main(new String[]{"sandeep", "patel"}, 10);

    }

    public static void main(String[] args, int x) {
        
        System.out.println("hello of me");
        System.out.println(args[0]+" , "+args[1]+" , x");

    }

    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
 
}
