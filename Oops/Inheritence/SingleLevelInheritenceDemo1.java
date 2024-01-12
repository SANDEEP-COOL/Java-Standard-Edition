class Vehicle{

    public void start() { System.out.println("Vehicle is starting..."); };

    public void stop() { System.out.println("Vehicle is stopping...."); };
}


class Car extends Vehicle {

    public void accelerate(){ System.out.println("Car is accelarating..."); };

    public void carBreak() { System.out.println("Car Break..."); };

}
public class SingleLevelInheritenceDemo1 {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.start();
        car.stop();

        car.accelerate();
        car.carBreak();

    }
}
