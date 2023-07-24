class Demo{

    int x = 10;

}

public class ClassForName {
    
    public static void main(String []args) throws Exception{

        Demo demo = (Demo)Class.forName("Demo").newInstance();
        System.out.println("x = "+demo.x);

    }

}
