import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class ReadTextAsStringEx1 {
    public static void main(String[] args) throws Exception{
        
        Path path = Paths.get("E:\\JAVASE\\FileHandeling\\f1.txt");
        System.out.println("path : "+path);
        String str = new String(Files.readAllBytes(path));
        System.out.println("str : "+str);

    }
}
