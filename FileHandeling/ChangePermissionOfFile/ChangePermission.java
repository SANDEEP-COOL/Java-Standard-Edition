import java.io.File;

public class ChangePermission {

    public static void main(String[] args) {
        
        File file = new File("E:\\JAVASE\\FileHandeling");
        System.out.println("readable : "+file.canRead());
        System.out.println("writable : "+file.canWrite());
        System.out.println("executable : "+file.canExecute());

        System.out.println("set readable : "+file.setReadable(true));

    }
    
}
