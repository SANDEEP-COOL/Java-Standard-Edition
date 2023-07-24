public class InitBlock {

    // init block 
    {
        System.out.println("init block");
    }
    {
        System.out.println("init block 2");
    }

    InitBlock(){
        System.out.println("Non-paramatraized constructor is called");
    }

    public static void main(String[] args) {
        
        InitBlock obj = new InitBlock();

    }
}
