import java.io.File;
import java.io.IOException;

public class DeleteFileEx1 {
    public static void main(String[] args) throws IOException{
    
        File f = new File("E:\\JAVASE\\fld1\\");
        if(f.delete()){
            System.out.println("deleted!");
        }
        else{
            System.out.println("not deleted!");
        }

    }
}
