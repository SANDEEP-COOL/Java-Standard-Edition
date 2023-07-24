// singelton class 
class Si{

    // private - static - reference
    private static Si reference;

    String s;

    // private - constructor 
    private Si() {
        s = "constructor runs...";
    }

    // public - static 
    public static Si getInstance() {

        // agar reference null hai 
        if(reference == null) {

            // to object banao aur address reference me store karo 
            reference = new Si();

        }

        return reference;

    }

}


public class SingeltonClass {
    
    public static void main(String[] args) {

        Si x = Si.getInstance();
        Si y = Si.getInstance();
        Si z = Si.getInstance();

        System.out.println("x.hashcode = "+x.hashCode());
        System.out.println("y.hashcode = "+y.hashCode());
        System.out.println("z.hashcode = "+z.hashCode());

    }

}
