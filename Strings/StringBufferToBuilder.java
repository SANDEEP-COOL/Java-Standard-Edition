public class StringBufferToBuilder {
    public static void main(String[] args) {

        // StringBuffer 
        StringBuffer buffer = new StringBuffer("Hello");

        // StringBuffer to String  
        String str = buffer.toString();

        StringBuilder builder = new StringBuilder(str);

        System.out.println("buffer to builder : "+builder);

    }
}
