import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormater {
    
    public static void main(String []args) throws ParseException{

        // object
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        // pass Date object
        String str = formatter.format(new Date());

        System.out.println("string date : "+str);

        // parsing given string 
        str = "13-11-2002";
        formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(str);

        System.out.println("Date date : "+date);

    }

}
