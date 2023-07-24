public class ExplicitTypeConversion1 {
    public static void main(String[] args) {
        
        char ch = 'A';

        // implicitly - char (2 bytes) to - int (4 bytes) 
        int num = ch;
        System.out.println("num : "+num);

        // explicitly - int (4 bytes) to - char (2 bytes)
        int num1 = 100;
        //char ch = num; - error - type mismatch cannot convert from int to char
        char ch1 = (char) num1;
        System.out.println("ch1 : "+ch1);

    }
}
