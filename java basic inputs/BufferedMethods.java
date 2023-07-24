package JAVA_BASICS_INPUTS;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedMethods {
    public static void main(String []args) throws IOException{

        FileReader fr = new FileReader("readingFile.txt");
        BufferedReader br  = new BufferedReader(fr);

        char ch[] = new char[20];

        // markSupported
        if(br.markSupported()){

            System.out.println("mark() method is supported");

            // mark 
            br.mark(4);

        }

        br.skip(7);

        // ready
        if(br.ready()){

            System.out.println(br.readLine());
            br.read(ch);

            for(int i = 0 ; i < 20 ; i++){

                System.out.print(ch[i]);

            }

            System.out.println();

            // reset
            br.reset();

            for(int i = 0 ; i < 7 ; i++){

                System.out.print((char)br.read());

            }

        }

        br.close();

    }

}
