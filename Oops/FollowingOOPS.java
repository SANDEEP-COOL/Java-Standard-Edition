package Oops;

class Sum {

    // These data members are not al all ACCESSIBLE outside of class Sum , without the help of methods.
    private int x;
    private int y;

    public Sum() {

    }

    public Sum(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int performSum() {
        return this.x + this.y;
    }

}

public class FollowingOOPS{

    public static void main(String[] args) {
        

        Sum s = new Sum(800 , 200);

        // Following the rule of OOPS , that is data members can only be accessed using methods through objects. 
        int sum = s.performSum();
        System.out.println("sum :" + sum);


    }
}