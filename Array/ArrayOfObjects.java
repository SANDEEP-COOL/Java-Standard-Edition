
class Student {
    
    String name;

    Student(String name) {
        this.name = name;
    }

}

public class ArrayOfObjects {
    public static void main(String[] args) {
        
        Student students[] = new Student[5];
        students[0] = new Student("A");
        students[1] = new Student("B");
        students[2] = new Student("C");
        students[3] = new Student("D");
        students[4] = new Student("E");

        for(Student student : students) {
            System.out.println("student.name : "+student.name);
        }

    }
}
