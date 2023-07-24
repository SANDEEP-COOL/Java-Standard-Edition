public class ExplicitTypeConversion2 {
    public static void main(String[] args) {
        
        // double 
        double d = 100.04d;

        // double (8 bytes) to long (8 bytes) - can be converted,
        // but fraction value can be left,
        // that's why java will not do conversion on it's own 
        // long l = d; - error - can't convert from double to long 
        long l = (long)d;
        System.out.println("l : "+l);


        // long (8 bytes) - int (4 bytes) - can't be converted 
        // int i = l; - error - can't convert from long to int 
        int i = (int)l;
        System.out.println("i : "+i);

    }
}
