import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;


public class PrintWriterEx2 {
    public static void main(String[] args) throws IOException{
        
        Writer writer1 = new PrintWriter(System.out);
        Writer writer2 = new PrintWriter(System.out);

        writer1.append('s');
        writer1.append('a');
        writer1.append('n');
        writer1.append('d');
        writer1.append('e');
        writer1.append('e');
        writer1.append('p');
        writer1.flush();

        writer2.append(" patel");
        writer2.flush();

    }
}
