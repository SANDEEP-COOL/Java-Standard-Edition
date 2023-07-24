public class TypePromotionInExpression {
    public static void main(String[] args) {

        int a = 10;
        double d = 20.05;

        // error - can't convert from double to int 
        // int ans = a + d;
        int ans = (int)(a + d);
        System.out.println("ans : "+ans);

    }
}
