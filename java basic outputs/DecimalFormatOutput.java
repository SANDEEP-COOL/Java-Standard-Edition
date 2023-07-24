import java.text.DecimalFormat;

public class DecimalFormatOutput {
    
    public static void main(String []args){

        double num = 123.4567;

        // prints only numeric part of a floating number
        DecimalFormat formatter = new DecimalFormat("#");
        System.out.println(formatter.format(num));

        // this will print it upto 2 decimal places
        formatter = new DecimalFormat("#.##");
        System.out.println(formatter.format(num));

        // automatically appends 0 to right of decimal
        formatter = new DecimalFormat("0000.00");
        System.out.println(formatter.format(num));

        // formatting money in dollars
        double income = 23456.789;
        formatter = new DecimalFormat("$##,###.00");
        System.out.println(formatter.format(income));

    }

}
