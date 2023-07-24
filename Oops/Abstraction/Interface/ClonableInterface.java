import java.lang.Cloneable;

class A implements Cloneable{

    int i;

    public A(int i) {
        this.i = i;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ClonableInterface {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        A a = new A(100);

        // cloning 'a' and holding
        // new cloned object reference in b

        A b = (A)a.clone();

        System.out.println("a.i = "+a.i);
        System.out.println("b.i = "+b.i);

    }
}
