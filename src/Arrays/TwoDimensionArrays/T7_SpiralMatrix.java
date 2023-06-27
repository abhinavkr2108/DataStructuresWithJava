package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * For a given Matrix, print its all elements in spiral order
 */
public class T7_SpiralMatrix {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
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
        printSpiralMatrix(row, col, matrix);
    }
    private static void printSpiralMatrix(int row, int col, int[][] matrix){
        int topRow=0, rightCol=col-1, bottomRow=row-1, leftCol=0;
        int totalElements =0;
        while (totalElements < row*col){
            // topRow => leftCol - rightCol
            for (int j=leftCol; j<=rightCol; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // rightCol => topRow - bottomRow
            for (int i = topRow; i <= bottomRow ; i++) {
                System.out.print(matrix[i][rightCol]+ " ");
                totalElements++;
            }
            rightCol--;
            // bottomRow => rightCol - leftCol
            for (int j=rightCol; j>=leftCol; j--){
                System.out.print(matrix[bottomRow][j]+ " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol => bottomRow - topRow
            for (int i=bottomRow; i>=topRow; i--){
                System.out.print(matrix[i][leftCol]+ " ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
