package Array;
public class MatrixAddition {
    public static void main(String[] args) {
        // creating the first matric using arrays
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };

        // creating the second matrix using two dimension array
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        // output array for storing the addition result
        int[][] output = new int[matrix1.length][matrix2[1].length];
//////////////////////////didnt understand matrix2[1]???
        System.out.println(matrix1.length);
        System.out.println(matrix2[1].length);
        // matrix addition core logic
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[1].length; j++) {
                output[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // printing the result
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[1].length; j++) {
                System.out.print(output[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
