import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) {
        
        String text = "hello";
        try{
            FileWriter writer = new FileWriter("E:\\JAVASE\\FileHandeling\\just\\f2.txt");

            // this will overwrite the previos content 
            writer.write(text);

            System.out.println("written successfully!");
            writer.close();
        }
        catch(IOException e){
            
        }

    }   
}
