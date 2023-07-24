import java.util.StringTokenizer;

public class StringTokenizerMethods{
    public static void main(String[] args) {
        
        // StringTokenizer object 
        StringTokenizer st1 = new StringTokenizer("how are you", " ");

        // process - while loop 
        while(st1.hasMoreTokens()){

            // get element 
            System.out.print(st1.nextToken()+" ");
        }

        System.out.println();
        // delimiter , : 
        StringTokenizer st2 = new StringTokenizer("Java : code : string", ":");
        
        while(st2.hasMoreTokens()) {
            System.out.print(st2.nextToken()+" ");
        }
        System.out.println();
        
        // true - delimiter will also be taken as one of th e token 
        StringTokenizer st3 = new StringTokenizer("Java : code : String", ":", true);
        
        while(st3.hasMoreTokens()) {
            System.out.print(st3.nextToken()+" ");
        }
    }
}