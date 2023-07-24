import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        
        Stack<String> name = new Stack<>();

        // push 
        name.push("ram");
        name.push("shyam");
        name.push("anil");
        name.push("raju");
        name.push("chandan");

        System.out.println(name);

        // pop()
        name.pop();
        System.out.println("poped : "+name);

        // peek()
        System.out.println("peeked : "+name.peek());

        // search()
        System.out.println("search : "+name.search("anil"));

        // empty()
        System.out.println("is empty : "+name.isEmpty());
        
    }
}
