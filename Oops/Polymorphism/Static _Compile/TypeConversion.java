
class A{
    static void fun(double d){
        System.out.println("d = "+d+" typeOf(d) = double");
    }

    static void fun(float d){
        System.out.println("d = "+d+" typeOf(d) = float");
    }
}

public class TypeConversion {
    public static void main(String[] args) {
        
        // type will be converted into immediate parent of the int datatype 
        A.fun(10);

    }   
 
}
