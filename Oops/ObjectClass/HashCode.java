class Student {

    private static int lastRollNo = 100;
    private int rollNo;

    public Student() {

        rollNo = lastRollNo;
        lastRollNo++;

    }

    @Override 
    public int hashCode() { 
        return rollNo;
    }

}


public class HashCode {
    
    public static void main(String[] args) {
        
        Student s = new Student();
        System.out.println(s.hashCode());

    }

}
