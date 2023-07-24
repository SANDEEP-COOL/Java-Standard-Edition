

public class JaggedArrays {
    public static void main(String[] args) {
        
        // int a1[][] = new int[2][];

        // a1[0] = new int[3];
        // a1[1] = new int [2];
        
        // a1[0][0] = 10; a1[0][1] = 12; a1[0][2] = 34;
        // a1[1][0] = 40; a1[1][1] = 65;

        // int a1[][] = new int[][] {
        //     new int[] {10, 12, 34},
        //     new int[] {40, 65}
        // };

        int a1[][] = new int[][] {{10, 12, 34}, {40, 65}};

        for(int i = 0 ; i < a1.length ; i++) {
            for(int j = 0 ; j < a1[i].length ; j++) {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
