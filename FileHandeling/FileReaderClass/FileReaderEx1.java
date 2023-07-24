
import java.io.*;

public class FileReaderEx1{
    public static void main(String[] args)throws IOException {
       
        File file = new File("E:\\JAVASE\\FileHandeling\\FileCreation.java");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

    }
}