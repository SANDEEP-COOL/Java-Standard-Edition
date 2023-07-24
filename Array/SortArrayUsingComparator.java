import java.util.Comparator;
import java.util.Arrays;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return this.name+" and "+this.rollNo;
    }
}

class SortByRollNo implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }

}

public class SortArrayUsingComparator {
    
    public static void main(String[] args) {
        
        Student arr[] = {
            new Student(1, "A"),
            new Student(10, "B"),
            new Student(7, "C"),
            new Student(0, "D")
        };

        System.out.println(("UNSORTED"));
        
        for(Student s : arr) {
            System.out.println(s.name+" and "+s.rollNo);
        }
        
        
        Arrays.sort(arr, new SortByRollNo() );
        System.out.println(("SORTED"));
        
        for(Student s : arr) {
            System.out.println(s.name+" and "+s.rollNo);
        }
        

    }

}
