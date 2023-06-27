package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * Question: For a given matrix find its transpose
 */

public class T4_MatrixTranspose {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter matrix rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter matrix columns: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Input your matrix");

        for (int i=0; i<row; i++){
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println("Transpose Matrix: ");
        squareMatrixTranspose(row, col, matrix);
//        int[][] transposeMatrix = transposeMatrix(row, col, matrix);
//        System.out.println("Transpose Matrix: ");
//        printMatrix(transposeMatrix);
    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Brute Force Approach:
     * Make a new matrix with no. of rows = no. of columns and
     * no. of columns = no. of rows
     */
    private static int[][] transposeMatrix(int row, int col, int[][] matrix){
        int[][] transposeMatrix = new int[col][row];
        for (int i=0; i<col; i++){
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }
    /**
     * Optimized Approach (works only for square matrix):
     * Swap elements across diagnol
     * Note: Start the j loop with index i else you will get the
     * original matrix only
     */
    private static void squareMatrixTranspose(int row, int col, int[][] matrix){
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        printMatrix(matrix);
    }
}
