
public class CharacterClassMethods {
    public static void main(String[] args) {
               
        System.out.println("isLetter");
        System.out.println("A : "+Character.isLetter('A'));
        System.out.println("1 : "+Character.isLetter('1'));
        
        System.out.println("isDigit");
        System.out.println("A : "+Character.isDigit('A'));
        System.out.println("1 : "+Character.isDigit('1'));

        System.out.println("isWhiteSpace");
        System.out.println("space : "+Character.isWhitespace(' '));

        System.out.println("isUpperCase");
        System.out.println("A : "+Character.isUpperCase('A'));
        System.out.println("a : "+Character.isUpperCase('a'));

        System.out.println("toUpperCase");
        System.out.println("a : "+Character.toUpperCase('a'));

        System.out.println("toLowerCase");
        System.out.println("A : "+Character.toLowerCase('A'));

        for(int i = 2432 ; i < 2559 ; i++) {
            char ch = (char)i;
            System.out.print(ch);
        }
        
    }
}
