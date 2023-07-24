import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

    public static void main(String[] args) throws IOException{
        
        FileOutputStream writer = new FileOutputStream("E:\\JAVASE\\FileHandeling\\f1.txt");
        String text = "this text is written using FileOutputStream class overwrite";
        byte bytesArr[] = text.getBytes();
        writer.write(bytesArr);
        System.out.println("written successfully!");

    }
    
}
