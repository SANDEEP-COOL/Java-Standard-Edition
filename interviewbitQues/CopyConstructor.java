class Student {
    int rollNo;
    String name;

    // PARAMATRAIZED CONSTRUCTOR 
    public Student(int rollNo, String name) {
        this.rollNo = rollNo; this.name = name;
    }

    // COPY CONSTRUCTOR 
    public Student (Student s) {

        this.rollNo = s.rollNo;
        this.name = s.name;

    }
}


public class CopyConstructor {
    public static void main(String[] args) {
        
        Student ram = new Student(6878,"RAM");
        Student shyam = new Student(ram);
        System.out.println(ram.rollNo+" , "+ram.name);
        System.out.println(shyam.rollNo+" , "+shyam.name);

    }
}
