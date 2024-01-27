// But now it is a TWIST , because Both class are presneted in DIFFERENT FILES and PACKAGES ,
// that's why now we must IMPORT it.

/*  Demo3.java:8: error: cannot find symbol
    GreetingsDemo3 g = new GreetingsDemo3();
         above error occurs it means that Demo3 can't FIND the GreetingDemo3.class file 
         becase you did NOT IMPORT that
*/

/*
    Demo3.java:11: error: GreetingsDemo3 is not public in D; cannot be accessed from outside package
    import D.GreetingsDemo3;
        above error occurs when java is not able to access class file because of it's ACCESSIBLITY MODE,
        you need to make it's VISIBILITY MODE , to PUBLIC.
 */

package C;
import D.GreetingsDemo3;

public class Demo3 {
    public static void main(String[] args) {
        GreetingsDemo3 g = new GreetingsDemo3();
        g.say();
    }
}
