import java.util.HashSet;
import java.util.TreeSet;

class Student1 implements Comparable<Student1>{
    private Integer marks;

    public Student1(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1 [marks=" + marks + "]";
    }

    public int compareTo(Student1 o){
        return this.marks - o.marks;
    }    
}
public class SortHashSetOfStudent {
    public static void main(String[] args) {

        HashSet<Student1> hs = new HashSet<>();
        hs.add(new Student1(500));
        hs.add(new Student1(300));
        hs.add(new Student1(400));
        hs.add(new Student1(450));
        hs.add(new Student1(200));
        System.out.println("Before sorting:");
        for(Student1 s : hs){
            System.out.println(s);
        }

        TreeSet<Student1> ts = new TreeSet<>(hs);

        System.out.println("After sorting:");
        for(Student1 s : ts){
            System.out.println(s);
        }

        // TreeSet implements NavigableSet interface 
        // System.out.println(ts.last());
    }
}
