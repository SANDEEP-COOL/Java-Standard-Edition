import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class SortByRollComparator implements Comparator<Student> {

    // ASCENDING ORDER 
    public int compare(Student a , Student b){ return a.rollNo - b.rollNo; }

}

class SortByNameComparator implements Comparator<Student> {

    // ASCENDING ORDER
    public int compare(Student a , Student b) { return a.name.compareTo(b.name); }

}

public class ComparatorDemo1 {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "aman", "ranji"));
        list.add(new Student(102, "raj", "adhartal"));
        list.add(new Student(178, "baman", "kanchanpur"));
        list.add(new Student(110, "yashwant", "indraprasth"));
        list.add(new Student(105, "anil", "sihora"));

        System.out.println("Unsorted....");

        for(Student s : list)
            System.out.println(s);

        // sorting student using ROLLNO 
        Collections.sort(list , new SortByRollComparator());

        System.out.println("After sorting based on Roll No...");
        
        for(Student s : list)
            System.out.println(s);

        System.out.println("\n//////////////////////////////////\n");

        System.out.println("Sorted by Name...");

        // sorting students using NAME
        Collections.sort(list , new SortByNameComparator());

        for(Student s : list)
            System.out.println(s);


    }
}
