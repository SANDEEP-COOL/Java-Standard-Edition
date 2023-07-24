
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 34, 21, 89, 12};
        try{
            System.out.println("arr[17] : "+arr[17]);
        }
        catch(ArrayIndexOutOfBoundsException a) {
            System.out.println("can't access out of range index!");
        }

    }
}
