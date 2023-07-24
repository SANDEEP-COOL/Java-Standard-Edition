class Box{
    int width, height, depth, boxNo;

    // Four arguments 
    Box(int width, int height, int depth, int boxNo){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.boxNo = boxNo;
    }
    
    // Non-paramatraized constructor 
    Box(){
        width = height = depth = 0;
    }

    // One-paramatraized constructor 
    Box(int boxNo){

        // here we need to set width, height, depth 
        this();

        this.boxNo = boxNo;

    }

    @Override
    public String toString(){
        return "box width = "+this.width+" , box height = "+this.height+" , box depth = "+this.depth+" , box No = "+this.boxNo;
    }
}

public class ThisReference {
    public static void main(String[] args) {
        
        Box box = new Box(100);
        System.out.println(box);

    }
}
