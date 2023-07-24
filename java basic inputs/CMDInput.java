package JAVA_BASICS_INPUTS;
public class CMDInput {
    public static void main(String[] args) {
        
        // command line input exist karta hai
        if(args.length > 0){

            System.out.println("The command line argument exist");

            for(String str : args) {
                System.out.println(str);
            }

        }

        // command line input exist nahi karta hai 
        else{

            System.out.println("The comand line does not exist");

        }

    }
}
