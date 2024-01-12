package Oops.Inheritence;

class Bicycle {

    int speed = 0;
    int gear = 0;

    public Bicycle(int speed , int gear) {

        this.gear = gear;
        this.speed = speed;

    }

    public void speedUp() {
        speed++;
    }

    public void applyBreak() {
        speed--;
    }

    @Override
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }

}

class MountainBike extends Bicycle {

    int seatHight = 0;

    public MountainBike(int speed , int gear , int seatHight) {

        // SINCE IN SUPER CLASS NO , NON-PARAMATRAIZED CONSTRUCTOR IS DEFINED THAT'S WHY WE MUST INVOKE ANY ANOTHER CONSTRUCTOR OTHERWISE JAVA WILL GIVE COMPILE TIME ERROR
        super(speed, gear);

        this.seatHight = seatHight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nseat height is " + seatHight;
    }

}

public class InheritenceDemo1 {
    public static void main(String[] args) {
        
        MountainBike MB = new MountainBike(100, 4, 25);
        System.out.println(MB);

    }
}
