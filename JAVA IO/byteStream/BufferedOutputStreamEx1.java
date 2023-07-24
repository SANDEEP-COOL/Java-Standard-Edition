import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class BufferedOutputStreamEx1 {

    public static void main(String[] args) throws IOException{
        
        FileOutputStream fos = new FileOutputStream("E:\\JAVASE\\f1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for(int i = 65; i < 75 ; i++) {
            bos.write(i);
        }

        byte[] bytes = new byte[] {75, 76, 77, 78, 79, 80};

        bos.write(bytes);

        bos.flush();

        bos.close();

        fos.close();

    }
    
}
