/*
    Demo4.java:7: error: say() has private access in GreetingsDemo4
    g.say();
        above error occurs when you didn't declare the MEMBERS as PUBLIC of another class.
 */

package E;
import F.GreetingsDemo4;

public class Demo4 {
    public static void main(String[] args) {
        GreetingsDemo4 g = new GreetingsDemo4();
        g.say();
    }
}
