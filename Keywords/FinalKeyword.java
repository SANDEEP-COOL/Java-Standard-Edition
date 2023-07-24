
public class FinalKeyword {

    // final variable - direct initialize 
    final int A = 10;

    // final variable - blank 
    final int B;
    final int C;

    // final variable - direct initialize - static variable 
    static final double PI = 3.141592653589793;

    // final vairable - blank - static variable 
    static final int D;

    // initializing final variable - initializer block 
    {
        System.out.println("init block");
        B = 20;
    }
    
    // initializing final variable - static block 
    static {
        System.out.println("static block");
        D = 30;
    }
    
    // constructor for initializing C
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    FinalKeyword(int C) {
        
        System.out.println("constructor");
        this.C = C;
    }

    public static void main(String[] args) {
        
        FinalKeyword fk = new FinalKeyword(40);
        System.out.println("A : "+fk.A+" and B : "+fk.B+" and C : "+fk.C+" and D : "+FinalKeyword.D);
        

    }
}
