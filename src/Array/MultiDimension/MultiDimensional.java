package Array.MultiDimension;

public class MultiDimensional {
    //addition of matrix
    public void multi() {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        int[][] ray = {{11, 32, 1}, {1, 2, 4}};
        int[][] total = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                total[i][j] = arr[i][j] + ray[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }


    }
}
