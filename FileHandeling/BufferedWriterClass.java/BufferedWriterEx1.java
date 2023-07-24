import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterEx1 {
    public static void main(String[] args) throws IOException{
        
        String text = "hello this is written using BufferedWriter class";
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\JAVASE\\FileHandeling\\f1.txt"));
        writer.write(text);
        System.out.println("written successfully!");
        writer.close();

    }
}
