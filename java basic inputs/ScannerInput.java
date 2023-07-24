package JAVA_BASICS_INPUTS;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("name = "+string+" and "+age);
        sc.close();

    }
}
