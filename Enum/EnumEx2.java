
enum EnumEx2 {

    // public static final by default 
    HELLO1;
 
    static private void say() {
        System.out.println("say hello");
    }

    public static void main(String[] args) {
        
        System.out.println("hello");
        EnumEx2.say();

    }

}
