class CellPhone{

    String name;

    CellPhone(){

    }

    CellPhone(String name){
        this.name = name;
    }

    public void call(){

        System.out.println("calling by "+this.name);

    }

}

class SmartPhone extends CellPhone{

    String name;

    SmartPhone(){

    }
        
    SmartPhone(String name) {

        super(name);
        this.name = name;

    }

    public void capturingPhoto(){

        System.out.println("capturing by "+this.name);

    }

}

public class InheritanceDemo extends SmartPhone{

    public static void main(String args[]){

        CellPhone nokia = new CellPhone("NOKIA");
        nokia.call();

        SmartPhone realme = new SmartPhone("realme");
        realme.capturingPhoto();

    }

}
