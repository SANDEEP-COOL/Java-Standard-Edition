interface I1{

    // default method
    default void show(){
        System.out.println("inside I1 show");
    }

}

interface I2{

    // default method 
    default void show(){
        System.out.println("inside I2 show");        
    }

}

public class DuplicateMethodsInInterfaces implements I1, I2{

    @Override
    public void show(){

        // calling - show - I1
        I1.super.show();

        // calling - show - I2 
        I2.super.show();

    }

    public static void main(String[] args) {
        
        DuplicateMethodsInInterfaces obj = new DuplicateMethodsInInterfaces();
        obj.show();

    }

}
