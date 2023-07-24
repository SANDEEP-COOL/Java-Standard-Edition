import java.util.Arrays;

public class ObjectVsPrimitive {
    public static void main(String[] args) {
        
        // x, primitive
        int x = 10;

        // copy x to y 
        int y = x;

        System.out.println("initially : x = "+x+" and y = "+y);

        // change y , x value will not be changed
        y = 30;

        System.out.println("after changing : x = "+x+" and y = "+y);

        // non - primitive 
        int c[] = {10, 20, 30, 40, 50};

        // copy c[] to d[]
        int d[] = c;

        System.out.println("initially : c = "+Arrays.toString(c)+" and d = "+Arrays.toString(d));

        // change d, c will not be changed 
        d[1] = 60;

        System.out.println("after changing : c = "+Arrays.toString(c)+" and d = "+Arrays.toString(d));

    }
}
