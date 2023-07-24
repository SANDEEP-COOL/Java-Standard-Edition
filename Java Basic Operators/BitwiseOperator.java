public class BitwiseOperator {
    public static void main(String[] args) {
        
        // bitwise 
        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : "+(d & e));
        System.out.println("d | e : "+(d | e));
        System.out.println("d ^ e : "+(d ^ e));
        System.out.println("~d : "+(~d));

        // right shift , signed
        System.out.println("d << 2 : "+(d << 2));

        // left shift , signed 
        System.out.println("e >> 1 : "+(e >> 1));

        // left shift , unsigned 
        System.out.println("e >>> 2 : "+(d << 2));

        // bitwise will internally convert in binary format, 
        // and then do calculations
        int a = 5;
        int b = 7;

        System.out.println("a & b : "+(a & b));
        System.out.println("a | b : "+(a | b));
        System.out.println("a ^ b : "+(a ^ b));

        // a is signed integer 32 bits,
        // each 32 bits will be fliped
        System.out.println("~a : "+(~a));
        
        a = 6;
        b = 9;
        
        System.out.println("a & b : "+(a & b));
        System.out.println("a | b : "+(a | b));
        System.out.println("a ^ b : "+(a ^ b));
        System.out.println("~a : "+(~a));

        String binary[] = {

            "0000", "0001", "0010", "0011", "0100", "0101",
            "0110", "0111", "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"

        };

        a = 3; b = 6;

        // or
        int c = a | b;

        // and 
        d = a & b;

        // xor
        e = a ^ b;

        // not 
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println("a = "+binary[a]);
        System.out.println("b = "+binary[b]);
        System.out.println("a | b = "+binary);
        System.out.println("a & b = "+binary[d]);
        System.out.println("a ^ b = "+binary[e]);
        System.out.println("~a & b | a & b = "+binary[f]);
        System.out.println("~a = "+binary[g]+" "+(~a));
        System.out.println("~100 : "+(~-100));


        // shift 
        int p = 7;
        System.out.println("p << 1 : "+(p << 1));

        p = 11;
        System.out.println("p << 2 : "+(p << 2));

        p = 8;
        System.out.println("8 << 1 : "+(p << 1));
    }
}
