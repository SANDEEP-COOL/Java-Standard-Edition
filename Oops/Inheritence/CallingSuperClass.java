class A{

    int x;

    A(){

    }

    A(int x){
        this.x = x;
    }

}

class B extends A{
    
    int y;
    
    B(int y) {
        super(y);
        this.y = y;
    }
    
}

public class CallingSuperClass {
    public static void main(String[] args) {
        
        B b = new B(100);
        System.out.println("b.y = "+b.y+" and b.x = "+b.x);
    }
}
