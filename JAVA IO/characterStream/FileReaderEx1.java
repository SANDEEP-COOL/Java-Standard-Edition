import java.io.IOException;
import java.io.FileReader;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException{
        
        FileReader source = null;
        source = new FileReader("E:\\JAVASE\\f1.txt");
        int temp;
        while((temp = source.read()) != -1) {
            System.out.print((char)temp+" ");
        }
        source.close();

    }    
}
