import java.util.Base64;

public class Ex1 {
    public static void main(String[] args) {
        
        String str = "India Team will win the Cup";

        System.out.println("sample String : "+str);

        String basicBase64Format = Base64.getEncoder().encodeToString(str.getBytes());

        System.out.println("basicBase64Format : "+basicBase64Format);

        byte[] bytes = Base64.getDecoder().decode(basicBase64Format);

        String actualString = new String(bytes);

        System.out.println(actualString);
    }
}
