// Since Greeting and Demo1 are presented in the SAME PROGRAMM that's why NO NEED to IMPORT 

package A;

class Greetings{
    public void say(){
        System.out.println("Good Morning...");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.say();
    }
}
