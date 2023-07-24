class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {

        String name1 = this.name;

        // Object to String  - is required to get student name property 
        Student student = (Student)object;

        // are they same instance 
        if(this == student) {
            return true;
        }

        if(name1.equals(student.name)) {
            return true;
        }
        else{
            return false;
        }

    }
    
}


public class Equals {
    public static void main(String[] args) {
        
        Student s1 = new Student("sandeep");
        Student s2 = new Student("sandeep patel");

        // comparing hashCode - Object's equals method 
        System.out.println(s1.equals(s2));

    }
}
