import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class ReadFileInListEx1 {
    public static void main(String[] args) throws IOException{
        
        List<String> lines =  Files.readAllLines(Paths.get("E:\\JAVASE\\FileHandeling\\f1.txt"), StandardCharsets.UTF_8);
        for(String s : lines) {
            System.out.println(s);
        }

    }
}
