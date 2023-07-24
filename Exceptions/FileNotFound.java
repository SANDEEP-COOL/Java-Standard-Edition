import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileNotFound {
    public static void main(String[] args) {

        try {
            File file = new File("info.txt");
            FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException f){
            System.out.println("File doesn't exist");
        }

    }
}
