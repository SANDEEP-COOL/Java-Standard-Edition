
public class ArraysEx1 {
    public static void main(String[] args) {
        
        // declaration 
        int arr[];

        // allocation memory 
        arr = new int[5];

        // storing value 
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        // accessing  
        for(int ele : arr) {
            System.out.print(ele+" ");
        }

    }   
}
