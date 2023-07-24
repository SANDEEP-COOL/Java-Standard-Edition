import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class FileHandelingEx2 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the directry path");
        String dpath = br.readLine();
        System.out.println("Enter the directry name");
        String dname = br.readLine();

        File dirObj = new File(dpath, dname);

        if(dirObj.exists()) {

            String l[] = dirObj.list();
            int n = l.length; 
            System.out.println("n : "+n+" lists : "+(Arrays.toString(l)));
            for(int i = 0 ; i < n ; i++) 
            {
                System.out.println(l[i]);
                File f1 = new File(l[i]);
                if (f1.isFile())
                System.out.println(": is a file");
                if (f1.isDirectory())
                System.out.println(": is a directory");

            }
    
        }
        else{
            System.out.println("directry dosn't exist");
        }

    }

}
