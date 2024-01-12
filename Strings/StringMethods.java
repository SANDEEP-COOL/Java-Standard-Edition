import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        
        // String name = "sandeep";
        // String name1 = "sandeep patel";
        // String a = "abc";

        // // length
        // System.out.println("length = "+name.length());

        // // charAt()
        // System.out.println("char at 3 index : "+name.charAt(3));

        // // substring 
        // System.out.println("getting substring : "+name.substring(1));

        // // sunstring(start, end)
        // System.out.println("substring in range : "+name.substring(3, 6));
        // String s = "sandeep";
        // System.out.println(s.substring(0 , 3));

        // // concat 
        // System.out.println("cancatination : "+name.concat("patel"));

        // // indexOf 
        // System.out.println("indexOf : "+name.indexOf("e"));

        // // indexOf 
        // System.out.println("index of after skiping 3 character : "+name.indexOf("e", 5));

        // // lastIndexOf 
        // System.out.println("last index of e : "+name.lastIndexOf("e"));

        // // lastIndexOf 
        // System.out.println("last index of after skiping 2 characters from last index : "+name.indexOf("e", 3));

        // // equals 
        // System.out.println("equals : "+name.equals(name1));

        // // equalsIgnoreCase 
        // System.out.println("ignoring cases then compare : "+("Geeks".equalsIgnoreCase("geeks")));

        // compareTo
        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = "hello";

        // System.out.println(s1.compareTo(s2)); // 0
        // System.out.println(s1.compareTo(s3)); // -32

        // System.out.println(s1.compareToIgnoreCase(s2)); // 0 
        // System.out.println(s1.compareToIgnoreCase(s3)); // 0

        // valueOf()
        float x = 25.434f;
        char[] a = {'1', '3', 'a'};
        String s = Arrays.toString(a);
        System.out.println("Array values: " + s);

    }
}
