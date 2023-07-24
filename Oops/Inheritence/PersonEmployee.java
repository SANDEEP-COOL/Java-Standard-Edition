// person 
class Person{

    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    void displayPerson(){
        System.out.println("person id : "+this.id+" and name : "+this.name);
    }
        
}

// employee 
class Employee extends Person{


    long sal;
    String department;

    Employee(int id, String name, long sal, String department){

        // id , name set by super constructor 
        super(id, name);

        // sal , department set by Employee constructor 
        this.sal = sal;
        this.department = department;
    }

    void employeeDisplay(){
        System.out.println("sal = "+this.sal+" and department = "+this.department);
    }
}


public class PersonEmployee {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(10, "sandeep", 120000, "cs");
        // show person 
        emp.displayPerson();
        // show employee
        emp.employeeDisplay();

    }

}
