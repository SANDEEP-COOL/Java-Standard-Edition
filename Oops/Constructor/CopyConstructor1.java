class A{

    int x;

    // A class object
    A(int x) {
        this.x = x;
    }

    // copy constructor 
    A(A a){
        this.x = a.x;
    }

    @Override 
    public String toString(){
        return "a.x = "+x;
    }
}

public class CopyConstructor1 {
    
    public static void main(String[] args) {
        
        // first A object 
        A a1 = new A(100);
        System.out.println("a1.x = "+a1.x);

        // second object using copy constructor,
        // taking A object  
        A a2 = new A(a1);
        System.out.println("a2.x = "+a2.x);

        System.out.println(a1);
    }

}
