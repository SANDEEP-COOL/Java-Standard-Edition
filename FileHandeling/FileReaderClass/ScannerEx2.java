import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ScannerEx2 {
    public static void main(String[] args) throws IOException{
        
        File file = new File("E:\\JAVASE\\FileHandeling\\f1.txt");
        Scanner sc = new Scanner(file);

        // delemiter 
        //Z 
        // - literal backslash
        // Z - end of file 

        sc.useDelimiter("\\z");

        System.out.println(sc.next());

    }
}
