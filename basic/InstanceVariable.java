public class InstanceVariable {

    // instance variables
    private String name;
    private int age;

    public InstanceVariable(String name, int age){
        this.name = name;
        this.age = age;
    }    

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    
    @Override
    public String toString(){
        return name+" and "+age;
    }

    public static void main(String []args) {

        InstanceVariable sandeep = new InstanceVariable("sandeep", 20);
        System.out.println(sandeep.getName()+" and "+sandeep.getAge());
        System.out.println(sandeep);

    }

}
