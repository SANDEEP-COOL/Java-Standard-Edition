class Employee{
    public static int base = 1000;
    int salary() {
        return base;
    }
}

class Manager extends Employee {
    @Override 
    int salary(){
        return (base + 2000);
    }
}


class Clerk extends Employee {
    @Override 
    int salary(){
        return base + 1000;
    }
}

public class RealLifeOverriddingEx {

    // using parent reference - can print any type of employee's salary
    static void printSalary(Employee e){
        System.out.println(e.salary());
    }

    public static void main(String[] args) {

        Employee obj1 = new Manager();

        // will print Manager salary 
        printSalary(obj1);

        obj1 = new Clerk();

        // will print salary of Clerk 
        printSalary(obj1);

    }
}
