import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


public class PrintWriterEx1 {
    public static void main(String[] args) throws IOException{
        
        char[] array = new char[]{'s', 'a', 'n', 'd', 'e', 'e', 'p'};

        Writer writer1 = new PrintWriter(System.out);
        Writer writer2 = new PrintWriter(System.out);
        Writer writer3 = new PrintWriter(System.out);
        Writer writer4 = new PrintWriter(System.out);
        Writer writer5 = new PrintWriter(System.out);

        // write(char)
        writer1.write(71);
        writer1.write(70);
        writer1.write(71);
        writer1.flush();
        System.out.println();
        
        
        // write(String) 
        String str = "hello geeks";
        writer2.write(str);
        writer2.flush();
        System.out.println();
        
        // write(String, off, len) 
        writer3.write(str, 2, 4);
        writer3.write(str, 5, 6);
        writer3.flush();
        System.out.println();
        
        // write(char[])
        writer4.write(array);
        writer4.flush();
        System.out.println();
        
        // write(char[], off, len)
        writer5.write(array, 1, 6);
        System.out.println();
        
        // close()
        writer1.close();
        writer2.close();
        writer3.close();
        writer4.close();
        writer5.close();
  

    }
}
