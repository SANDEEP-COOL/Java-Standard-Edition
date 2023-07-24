
public class ParamatraizedConstructor {
    
    int x;
    float y;
    char ch;

    // paramatraized 
    ParamatraizedConstructor(int x, float y, char ch) {
        this.x = x;
        this.y = y;
        this.ch = ch;
    }

    public static void main(String[] args) {
        
        ParamatraizedConstructor obj = new ParamatraizedConstructor(10, 10.54f, 'A');
        System.out.println("obj.x = "+" obj.y = "+obj.y+" obj.ch = "+obj.ch);

    }

}
