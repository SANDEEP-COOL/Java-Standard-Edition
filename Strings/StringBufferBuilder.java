public class StringBufferBuilder {

    public static void concat1(String s1) {
        s1 = s1 + "patel";
    }

    public static void concat2(StringBuffer name){
        name.append("patel");
    }

    public static void concat3(StringBuilder name) {
        name.append("patel");
    }

    public static void main(String[] args) {
        
        String s1 = new String("sandeep");
        concat1(s1);
        System.out.println("s1 = "+s1);

        StringBuffer s2 = new StringBuffer("roshni");
        concat2(s2);
        System.out.println("s2 = "+s2);

        StringBuilder s3 = new StringBuilder("kamlesh");
        concat3(s3);
        System.out.println("s3 = "+s3);


    }
}
