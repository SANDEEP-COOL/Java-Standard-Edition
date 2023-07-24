import java.io.IOException;
import java.io.FileOutputStream;


public class FileOutputStreamEx2 {

    public static void main(String[] args) throws IOException{
        
        String data = "welcome to gfg";
        FileOutputStream fos = new FileOutputStream("E:\\JAVASE\\f1.txt");

        // string - to byte array
        byte[] bytes = data.getBytes();
        
        fos.write(bytes);

        fos.close();

    }
    
}
