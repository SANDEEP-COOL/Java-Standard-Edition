import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) throws IOException{
        
        File file = new File("E:\\JAVASE\\FileHandeling\\f1.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
