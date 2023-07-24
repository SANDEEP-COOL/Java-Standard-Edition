public class WrapperClasses {
    public static void main(String[] args) {
        
        // autoboxing
        int a = 10;

        // implicit conversion 
        Integer b = a;
        System.out.println("Integer b = "+b);

        // unboxing
        Character ch = new Character('A');
        char ch1 = ch;
        System.out.println("ch1 = "+ch1);

    }
}
