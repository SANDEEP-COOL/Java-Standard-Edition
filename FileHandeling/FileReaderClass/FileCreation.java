import java.io.File;
import java.io.IOException;

public class FileCreation {

    static void newFile() {
        try {    
            // Getting the path till the parent directory of the file
            String pathName = "E:/JAVASE/sandeep";
    
            // Getting the file name
            String fileName = "new.txt";
    
            // File object
            File file = new File(pathName, fileName);
    
            file.createNewFile();
            System.out.println("File created successfully!");
    
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        newFile();
    }
}
