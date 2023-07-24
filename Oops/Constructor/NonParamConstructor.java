
public class NonParamConstructor {
    
    NonParamConstructor(){

        super();
        System.out.println("Non paramatraized Constructor called!");

    }


    public static void main(String[] args) {
        

        NonParamConstructor obj = new NonParamConstructor();
        System.out.println(obj instanceof Object);

    }


}
