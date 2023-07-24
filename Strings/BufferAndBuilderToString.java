public class BufferAndBuilderToString {
    public static void main(String[] args) {
        
        StringBuffer buffer = new StringBuffer("Geeks");
        StringBuilder builder = new StringBuilder("Hello");

        String str = buffer.toString();

        System.out.println("StringBuffer to String : "+str);

        String str1 = builder.toString();

        System.out.println("StringBuilder to String : "+str1);

    }
}
