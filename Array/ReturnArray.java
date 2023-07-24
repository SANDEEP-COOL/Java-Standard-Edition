
public class ReturnArray {

    static int[] m1() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        
        int arr[] = m1();
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
