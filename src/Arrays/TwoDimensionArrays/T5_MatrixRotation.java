package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * For a given matrix, rotate the matrix by 90 degree
 */

public class T5_MatrixRotation {
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
        System.out.println("Rotated Matrix");
        rotateMatrix(row, col, matrix);

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
     * Approach:
     * 1. Find transpose of the matrix
     * 2. Reverse each row
     */
    private static void rotateMatrix(int row, int col, int[][] matrix){
        for (int i = 0; i < row; i++) {
            for (int j=i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            reverseArray(matrix[i]);
        }
        printMatrix(matrix);

    }
    private static void reverseArray(int[] array){
        int i=0, j= array.length-1;
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
