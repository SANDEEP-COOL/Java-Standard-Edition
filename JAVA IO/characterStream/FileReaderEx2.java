import java.io.Reader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;

public class FileReaderEx2 {

    public static void main(String[] args) throws IOException{
        
        Reader r = new FileReader("E:\\JAVASE\\f1.txt");
        PrintStream out = System.out;
        char[] ch = new char[15];

        // mark supported 
        if(r.markSupported()){
            r.mark(4);
            System.out.println("mark method is supported!");
        }

        // skipping 5 charcters 
        r.skip(2);

        // checking - this stream is ready to be read 
        if(r.ready()) {
            r.read(ch, 0, 15);
            System.out.println(Arrays.toString(ch)+" length : "+ch.length);
        }

        r.close();

    }
    
}
