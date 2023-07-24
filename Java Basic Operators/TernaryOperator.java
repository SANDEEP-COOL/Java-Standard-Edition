public class TernaryOperator{
    public static void main(String []args){

        int a = 20;
        int b = 10;
        int c = 30;

        int result = (a < b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(result);

        int n1 = 10, n2 = 0, max;

        System.out.println("first num : "+n1);
        System.out.println("second num : "+n2);

        max = (n1 > n2) ? n1 : n2;

        System.out.println("maximum in n1 and n2 is : "+max);

        n1 = 5; n2 = 10; 
        int res;

        System.out.println("n1 = "+n1+" and n2 = "+n2);


        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        System.out.println("res : "+res);

        boolean condition = false;

        String ans = (condition) ? "true" : "false";

        System.out.println("result : "+ans);

    }
}