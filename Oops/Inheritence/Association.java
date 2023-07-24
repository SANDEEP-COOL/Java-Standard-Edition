import java.util.Set;
import java.util.HashSet;

// class 1
class Bank{

    private String name;
    private Set<Employee> employees;

    Bank(String name) {
        this.name = name;
    }

    public String getBankName(){
        return this.name;        
    }

    // set Employee for Bank 
    public void setEmployees(Set<Employee> employees) {

        this.employees = employees;

    }

    // get Employees of Bank 
    public Set<Employee> getEmployee(){

        return this.employees;

    }
}

// class 2 
class Employee{

    private String name;
    
    Employee(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

// class 3 
// ASSOCIATION 
public class Association {
    public static void main(String[] args) {
        
        Bank bank = new Bank("ICIC");
        Employee employee = new Employee("Ridhi");

        Set<Employee> employees = new HashSet<>();
        employees.add(employee);    

        bank.setEmployees(employees);

        System.out.println(employee.getName()+" Belongs to bank "+bank.getBankName());

    }
}
