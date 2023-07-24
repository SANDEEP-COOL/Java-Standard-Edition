

public class StringBuilderMethods {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Sandeep");
        System.out.println("sb = "+sb);

        StringBuilder sb1 = new StringBuilder("sandeep patel");
        System.out.println("sb1 = "+sb1);

        StringBuilder sb3 = new StringBuilder("10");
        System.out.println("sb3 capacity = "+sb3.capacity());

        StringBuilder sb4 = new StringBuilder(sb.toString());
        System.out.println("sb4 = "+sb4);
        

    }
}
