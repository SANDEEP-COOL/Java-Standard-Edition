class Car {

    // private 
    private String name;

    // setter 
    public void setName(String name) {
        this.name = name;
    }

    // getter 
    public String getName() {
        return this.name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.setName("Honda");
        System.out.println("Car name is: " + c.getName());

    }
}
