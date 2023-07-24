interface Test{
    interface Yes{
        void show();
    }
}

class Testing implements Test.Yes{
    @Override
    public void show(){
        System.out.println("inside Testing class and show method!");
    }
}

public class NestedInterfaceEx1 {
    public static void main(String[] args) {
        
        Testing t = new Testing();
        t.show();

    }
}
