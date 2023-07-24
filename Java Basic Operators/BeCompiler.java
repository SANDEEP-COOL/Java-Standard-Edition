public class BeCompiler {
    public static void main(String[] args) {
        
        int a = 20, b = 10, c = 0;

        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b+++c;
        System.out.println("a = "+a+" and b = "+b);

        // a = b+++++c; compilation error

    }
}
