public class PrecedenceAssociativity {
    public static void main(String []args){

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        // firstly check for precedence,
        // if precedence equal then check for associativity
        
        System.out.println("a+b/d = "+(a + b / d));
        System.out.println("a+b*d-e/f = "+(a + b * d - e / f));

    }
}
