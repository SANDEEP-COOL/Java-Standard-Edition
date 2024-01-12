class Employee{
    String name;
    int employeeId;

    public Employee(String name , int employeeId) {
        this.name = name ; this.employeeId = employeeId;
    }

    public void display() {
        System.out.println("Employee name : "+name+" and id : "+employeeId);
    }
        
}

class Manager extends Employee {
    String department;

    public Manager(String name , int employeeId , String department){
        
        // calling PARAMATRAIZED CONSTRUCTOR is must 
        super(name, employeeId);

        this.department = department;

    }

    public void manageTeam() {
        System.out.println("Manager is managing Team in "+department+" department");
    }
}

class Director extends Manager{

    String division;

    public Director(String name , int employeeId , String department , String division) {
    
        super(name , employeeId , department);

        this.division = division;

    }

    public void takeDicisions() {

        System.out.println("Director is making strategic decisions for the "+division+" division");

    }
}

public class MultiLevelInheritenceDemo1{

    public static void main(String[] args) {
        
        // The DIRECTOR object is created ,
        // but remeber that it is indirectly EMPLOYEE and MANAGER as well,
        Director d = new Director("sandeep patel", 7, "CS", "C");

        d.display();
        d.manageTeam();
        d.takeDicisions();

    }

}