// abstract class 
abstract class Car{

    // abstract method 
    public abstract void stop();

}

// concerete class 
class Honda extends Car{

    // overriding
    @Override 
    public void stop(){

        System.out.println("Honda : stop");
        System.out.println("mechanism to stop the car using break");

    }

}

public class AbstractionDemo {
 
    public static void main(String[] args) {
        
        // Car object 
        Car car = new Honda();

        // calling stop 
        car.stop();
    }

}
