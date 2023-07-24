public class Arithimatic{
    public static void main(String[] args) {
        
        try{

            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("c : "+c);

        }
        catch(ArithmeticException e){
            System.out.println("can't divide by 0");
        }


    }
}