package Oops;
// SINCE IN THIS TYPE OF PROGRAMMING THE ATTRIBUTES OF AN OBJECT ARE BEING ACCESSED DIRECTLY,
// WHICH IS NOT FOLLOWING ONE OF THE CONCEPT OF OOPS, THAT IS IF YOU PERFORM ANY OPERATION ON OBJECT,
// THEN THAT SHOULD BE PERFORMED USING METHOD THROUGH OBJECT.

class Sum {

    int x;
    int y;

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

public class NotFollowingOOPS{

    public static void main(String[] args) {
        

        Sum s = new Sum();
        s.x = 100;
        s.y = 200;
        int sum = s.x + s.y;
        System.out.println("sum :" + sum);


    }
}