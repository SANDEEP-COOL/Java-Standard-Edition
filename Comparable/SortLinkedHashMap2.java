import java.util.*;

class Student implements Comparable<Student> {

    private String name;
    private Character grade;

    public Student(String name , Character grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public Character getGrade(){
        return grade;
    }

    public int compareTo(Student other) {
        return this.grade - other.grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }

    
}

public class SortLinkedHashMap2{
    public static void main(String[] args) {
        
        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(new Student("John" , 'A'));
        set.add(new Student("Dong", 'Z'));
        set.add(new Student("Anaw" , 'B'));

        System.out.println("Before Sorting...");
        for(Student s : set){
            System.out.println(s);
        }

        System.out.println("After Sorting...");
        TreeSet<Student> ts = new TreeSet<>(set);
        for(Student s : ts){
            System.out.println(s);
        }        
    }
}