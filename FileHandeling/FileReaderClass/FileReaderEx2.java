import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {
    public static void main(String[] args) throws IOException{

        FileReader fr = new FileReader("E:\\JAVASE\\FileHandeling\\f1.txt");
        int i;
        while((i = fr.read()) != -1) {
            System.out.print((char)i);
        }

    }
}
