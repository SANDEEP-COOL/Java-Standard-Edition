import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {
        
        try{

            String path = "";
            String file = "";
    
            path = "E:\\JAVASE\\FileHandeling\\";
            file = "f1";

            String content = "This is created by File output FileOutputStream";
            byte byteContent[] = content.getBytes();
    
            FileOutputStream fos = new FileOutputStream(path + "" + file +".txt");

            fos.write(byteContent);

            System.out.println("created!");

        }
        catch(IOException i) {

        }

    }
}
