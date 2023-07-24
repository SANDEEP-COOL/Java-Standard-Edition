
interface A{

    void meth1();
    void meth2();
    void meth3();

    // this is only possible from jdk 9 
    // private static void meth4(){
    //     System.out.println("inside meth4");
    // }

}


interface B extends A{

    void meth3();

}

public class ExtendingInterface implements B{
    
    @Override 
    public void meth1(){

        System.out.println("inside meth1");

    }

    @Override 
    public void meth2(){

        System.out.println("inside meth2");

    }

    @Override 
    public void meth3(){

        System.out.println("inside meth3");

    }

    public static void main(String[] args) {
        
        ExtendingInterface obj = new ExtendingInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();

    }


}
