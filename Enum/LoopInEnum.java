enum Color{
    RED,
    GREEN,
    BLUE;
}


public class LoopInEnum {

    public static void main(String[] args) {
        
        // iterate over all the values of enum  
        for(Color c : Color.values()) {

            System.out.println(c);

        }

    }
    
}
