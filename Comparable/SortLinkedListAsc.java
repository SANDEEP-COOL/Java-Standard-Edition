import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int id , rank;

    public  Student(String name,int id , int rank) {
        this.name = name; this.id = id; this.rank = rank;
    }

    public int compareTo(Student other) {
        if(this.rank > other.rank)
            return 1;
        else if(this.rank < other.rank)
            return -1;
        else 
            return 0;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", rank=" + rank + "]";
    }
} 

public class SortLinkedListAsc {
    public static void main(String[] args) {
        Student s1 = new Student("sandeep", 101 , 1);
        Student s2 = new Student("pankaj", 200, 5);
        Student s3 = new Student("neeraj", 300, 3);
        Student s4 = new Student("roshni", 232, 6);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("\nBefore sorting:");
        for(Student s : list){
            System.out.println(s);
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("After sorting:");
        for(Student s : list){
            System.out.println(s);
        }

    }
}
