// to use clone(), must override cloneable interface
public class CloneObject implements Cloneable {

    int x = 10;

    public static void main(String []args) throws Exception{

        CloneObject cb1 = new CloneObject();
        System.out.println("cb1.x = "+cb1.x);
        
        // creating copy of CloneObject
        CloneObject cb2 = (CloneObject)cb1.clone();
        System.out.println("cb2.x = "+cb2.x);

    }

}
