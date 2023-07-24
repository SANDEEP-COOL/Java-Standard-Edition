public class ThisExample {

    int num = 10;

    ThisExample(){

        System.out.println("Non-paramatraized constructor");

    }

    ThisExample(int num) {

        // calling non-paramatraized constructor 
        this();

        this.num = num;

    }

    void display(){

        this.show();

        System.out.println("num : "+this.num);

    }

    void show(){

        System.out.println("inside show method");

    }

    public static void main(String []args) {

        ThisExample obj = new ThisExample(100);
        obj.display();

    }

}
