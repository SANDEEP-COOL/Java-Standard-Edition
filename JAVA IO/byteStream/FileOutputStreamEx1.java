import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamEx1 {

    public static void main(String[] args) throws IOException{
        
        FileOutputStream fos = new FileOutputStream("E:\\JAVASE\\f1.txt");
        String str = "TATA";
        char ch[] = str.toCharArray();
        for(int i = 0 ; i < str.length() ; i++) {
            fos.write(ch[i]);
        }

        fos.close();
    }
    
}
