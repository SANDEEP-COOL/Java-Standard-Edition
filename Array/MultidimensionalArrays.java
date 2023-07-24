
public class MultidimensionalArrays {
    public static void main(String[] args) {
        
        // 2D 
        int arr[][] = new int [2][2];
        int arr1[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 2 rows and 2 columns 
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;

        // arr.length - row count 
        for(int i = 0 ; i < arr.length ; i++) {

            // arr[i].length - column count  
            for(int j = 0 ; j < arr[i].length ; j++) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
