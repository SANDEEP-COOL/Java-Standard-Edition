
public class ConstructorChainingUsingThis {

    ConstructorChainingUsingThis(){
        this(5);
        System.out.println("Non-paramtraized constructor : ");
    }
    
    ConstructorChainingUsingThis(int x){
        this(x, 10);
        System.out.println("One-paramtraized constructor");
        
    }
    
    ConstructorChainingUsingThis(int x, int y) {
        this(x, y, 15);
        System.out.println("Two-paramtraized constructor");
    }

    ConstructorChainingUsingThis(int x, int y, int z) {
        System.out.println("Three-paramatraized constructor");
    }

    public static void main(String args[]){

        ConstructorChainingUsingThis obj = new ConstructorChainingUsingThis();

    }
}
