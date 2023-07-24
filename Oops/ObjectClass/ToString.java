
class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("name : "+name);
    }

    @Override
    public String toString(){
        return "name : "+name;
    }
}

public class ToString {

    public static void main(String[] args) {
        
        Student s = new Student("sandeep");
        s.getName();

        // object class hashcode 
        System.out.println(s);

    }

}
