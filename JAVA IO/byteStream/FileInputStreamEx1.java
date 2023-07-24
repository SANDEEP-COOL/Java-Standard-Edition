import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx1 {
    
    public static void main(String[] args) {
        
        FileInputStream source = null;
        FileOutputStream target = null;

        try {
            source = new FileInputStream("E:\\JAVASE\\f1.txt");
            target = new FileOutputStream("E:\\JAVASE\\f2.txt");

            // reading source and writing to target,
            // byte by byte
            int temp;
            while((temp = source.read()) != -1) {
                System.out.println(temp);
                target.write(temp);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally{
            try{

                if(source != null)
                    source.close();
                else if(target != null)
                    target.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }


    }

}
