import java.io.File;

public class FileHandelingEx1 {
    
    public static void main(String[] args) {
        
        File file = new File("E:/main/sub1/sub2/demo.txt");

        // name 
        System.out.println("getName() : "+file.getName());

        // path 
        System.out.println("getPath() : "+file.getPath());

        // absolute path 
        System.out.println("getAbsolutePath() : "+file.getAbsolutePath());

        // parent 
        System.out.println("exists() : "+file.exists());

        if(file.exists()) {
            System.out.println("canWrite() : "+file.canWrite());
            System.out.println("canRead() : "+file.canRead());
            System.out.println("isDirectory() : "+file.isDirectory());
            System.out.println("length() : "+file.length());
        }

    }

}
