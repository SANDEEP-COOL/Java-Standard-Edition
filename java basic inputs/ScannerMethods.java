package JAVA_BASICS_INPUTS;
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String []args){

        System.out.println(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("Enter mobile No.");
        long mobileNo = sc.nextLong();
        System.out.println("Enter cgpa");
        double cgpa = sc.nextDouble();
        System.out.printf("name = %s , gender = %c , age = %d , mobile No. = %d , cgpa = %f", name, gender, age, mobileNo, cgpa);
        sc.close();

    }
}
