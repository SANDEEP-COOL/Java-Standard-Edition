public class InstanceOfOperator {
    
    interface MyInterface{

    }

    static class Person{
        
    }

    class Boy extends Person implements MyInterface{

    }

     
    public static void main(String[] args) {
        
        // Person 
        Person person = new Person();

        // Boy 
        Boy boy = new InstanceOfOperator().new Boy();

        // Person is not an instance of Boy 
        System.out.println("person instanceof Boy = "+(person instanceof Boy));

        // Boy is an instance of Person 
        System.out.println("boy instanceof Person = "+(boy instanceof Person));        

        // Person is not an instance of MyInterface 
        System.out.println("person instanceof MyInterface = "+(person instanceof MyInterface));

        // Boy is an of MyInterface 
        System.out.println("boy instanceof MyInterface = "+(boy instanceof MyInterface));
    }
}
