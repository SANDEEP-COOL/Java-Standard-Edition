class Vehicle{

    public void start() { System.out.println("vehicle is starting...."); };
    public void stop() { System.out.println("vehicle is stopping...."); };

}

class Car extends Vehicle {

    public void drive() { System.out.println("car is drived...."); };
    public void applyBreak() { System.out.println("car is applying break..."); };

}

class SportsCar extends Car {

    public void boost() { System.out.println("sports car is boosting...."); };

}

public class MultiLevelInheritence {

    public static void main(String[] args) {
        
        SportsCar s = new SportsCar();
        s.start();
        s.stop();
        s.drive();
        s.applyBreak();
        s.boost();

    }
}
