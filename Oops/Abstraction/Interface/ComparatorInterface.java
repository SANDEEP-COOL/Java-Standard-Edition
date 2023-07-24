import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

// Student 
class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override 
    public String toString(){
        return "name = "+name+" and rollNo = "+rollNo+" and address = "+address;
    }
}

// Helper class implementing Comparator Interface 
class SortByRollNo implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    @Override
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }

}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }

}

public class ComparatorInterface {
    public static void main(String[] args) {
        
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        System.out.println("UNSORTED\n");
        
        for(int i = 0 ; i < ar.size() ; i++) {
            System.out.println(ar.get(i));
            // sorting student entries by rollNo 
            Collections.sort(ar, new SortByRollNo());
        }
        
        System.out.println("SORTED BY ROLL NO\n");
        
        for(int i = 0 ; i < ar.size() ; i++) {
            System.out.println(ar.get(i));
            // sorting student entries by rollNo 
            Collections.sort(ar, new SortByName());
        }
        
        System.out.println("\n");
        System.out.println("SORTED BY NAME\n");
        for(int i = 0 ; i < ar.size() ; i++) {
            System.out.println(ar.get(i));
        }
    }
}
