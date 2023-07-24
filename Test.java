// import java.util.Vector;

public class Test
{
    public static void main(String[] args)
    {
        // Vector<Integer> v = new Vector<>(214444234);
        // Vector<Integer> v1 = new Vector<>(2147444446);
        // Vector<Integer> v2 = new Vector<>(21444423);
        // System.out.println("Memory Leaks");

        String s = "Sandeep";
        String s1 = "deep";
        if(s.indexOf(s1) != -1)
            System.out.println("0");
        else 
            System.out.println("-1");

    }
} 