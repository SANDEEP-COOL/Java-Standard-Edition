import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
    public static void main(String[] args) throws IOException{
        
        FileInputStream fin = new FileInputStream("E:\\JAVASE\\f1.txt");
        
        // getChannel()
        System.out.println(fin.getChannel());

        // getFD()
        System.out.println(fin.getFD());

        // number of remaining bytes 
        System.out.println(fin.available());

        // skip()
        fin.skip(2);

        int temp;
        while((temp = fin.read()) != -1) {
            System.out.println((char)temp);
        }

        // fin.close();
    }   
}
