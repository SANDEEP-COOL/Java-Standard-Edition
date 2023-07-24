class A{

    public void display(){

        System.out.println("display from class A");

    }

}


public class MethodOverriding extends A{
    
    @Override
    public void display(){

        System.out.println("display from class MethodOverloading");

    }

    public static void main(String[] args) {
        
        // object - class A , reference - class A 
        A a = new A();
        a.display();

        // object - MethodOverriding, reference - class A 
        A b = new MethodOverriding();
        b.display();
    }

}
