class Singelton{

    int x = 10;
    static Singelton instance = null;

    // private constructor - can't be accessed outside of the class 
    private Singelton(){}

    // static - because will be called using class name 
    static public Singelton getInstance(){

        System.out.println("instance = "+instance);
        if(instance == null)
            instance = new Singelton();
        return instance;

    }
}

public class SingeltonClass {
    
    public static void main(String[] args) {
        
        Singelton instance = Singelton.getInstance();
        System.out.println("instance.x = "+instance.x);

        Singelton instance1 = Singelton.getInstance();
        System.out.println("instance1.x = "+instance1.x);

    }

}
