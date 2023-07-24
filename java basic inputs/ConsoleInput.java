package JAVA_BASICS_INPUTS;
public class ConsoleInput {
    public static void main(String[] args) {
     
        // data console window se read karne ke liye , it doesn't work in IDE
        String name = System.console().readLine();
        System.out.println(name);

    }
}
