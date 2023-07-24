
public class CopyConstructor {

    String name;
    int age;

    // paramatraized 
    CopyConstructor(String name, int age) {
    
        this.name = name;
        this.age = age;
    
    }

    // copy Constructor
    CopyConstructor(CopyConstructor original) {

        this.name = original.name;
        this.age = original.age;

    }


    public static void main(String []args) {

        CopyConstructor obj = new CopyConstructor("sandeep", 20);
        System.out.println("obj.name = "+obj.name+" and obj.age = "+obj.age);
        CopyConstructor obj1 = new CopyConstructor(obj);
        System.out.println("obj1.name = "+obj1.name+" and obj1.age = "+obj1.age);

    }

}
