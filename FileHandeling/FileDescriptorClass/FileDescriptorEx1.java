import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorEx1 {
    public static void main(String[] args) throws IOException{
        
        byte arr[] = {58, 34, 99, 126, 12};

        // FileDescriptor object 
        FileDescriptor discriptor = null;

        // FileOutputStream 
        FileOutputStream fos = new FileOutputStream("E:\\JAVASE\\FileHandeling\\f1.txt");

        // object of FileDescriptor
        discriptor = fos.getFD();

        // write byte[]
        fos.write(arr);

        // perform sync operation 
        discriptor.sync();

        System.out.println("syned!");
    }
}
