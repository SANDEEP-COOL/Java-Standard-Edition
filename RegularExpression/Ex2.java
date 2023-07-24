import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Ex2 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("(geeks)");
        Matcher m = pattern.matcher("geeksforgeeks");

        while(m.find()) {
            System.out.println("geeks found from "+m.start());
        }

        System.out.println(m.groupCount());
        
    }
}
