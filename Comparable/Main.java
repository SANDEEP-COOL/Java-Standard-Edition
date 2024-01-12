import java.util.*;

class sortByNameThenMarks implements Comparator<Student> {

    @Override
    public int compare(Student s1 , Student s2) {

        if(s1.name.equals(s2.name))
            return s1.marks - s2.marks;
        else 
            return s1.name.compareTo(s2.name);

    }

}

public class Main {

    public static void main(String[] args) {
        

        List<Student> list = new ArrayList<>();
        list.add(new Student(20, "C"));
        list.add(new Student(10, "B"));
        list.add(new Student(10, "A"));
        list.add(new Student(25, "A"));

        // forComparable
        Collections.sort(list);

        // for Comparator 
        // Collections.sort(list , new sortByNameThenMarks()); 

        System.out.println(list);

    }

}
