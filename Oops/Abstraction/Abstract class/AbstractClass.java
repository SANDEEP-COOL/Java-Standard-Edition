
abstract class SunStar{
    abstract protected void printInfo();
}

class Employee extends SunStar{
    @Override 
    protected void printInfo(){
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println("name = "+name+" age = "+age+" salary = "+salary);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        
        SunStar s = new Employee();
        s.printInfo();

    }
}
