public class StringToBufferAndBuilderConversions {
    public static void main(String[] args) {
        
        String str = "geeks";

        StringBuffer buffer = new StringBuffer(str);

        buffer.reverse();

        System.out.println("buffer : "+buffer);

        StringBuilder builder = new StringBuilder(str);

        builder.append("forgeeks");

        System.out.println("builder : "+builder);

    }
}
