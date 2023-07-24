
public class FinalArray {
    public static void main(String[] args) {
        
        final int arr[] = new int[]{10, 20, 30};

        // reference is final , can't be assigned new object reference 
        // arr = new int[]{40, 50};

        // but values can be changed 
        arr[1] = 60;

        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
