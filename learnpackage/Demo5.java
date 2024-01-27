/*
    since , Here the GreetingsDemo5.class file was NOT PRESENTED in the learnpackage directry, 
    that's why we got an error of CAN NOT FIND SYMBOL,because java was searching this inside the current directry means
    inside learnpaackage but it is presented in the S1 directry,

    so we want that java searches this inside S1 , then we must set it's class path , remember to set path till PARENT directry
    in classpath.
 */

package G;
import sandeep.H.GreetingsDemo5;

public class Demo5 {
    public static void main(String[] args) {
        GreetingsDemo5 g = new GreetingsDemo5();
        g.say();
    }
}