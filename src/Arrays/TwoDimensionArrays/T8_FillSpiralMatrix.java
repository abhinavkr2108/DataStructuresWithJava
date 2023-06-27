package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * For a given number print a square matrix containing all numbers in spiral order
 */
public class T8_FillSpiralMatrix {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        System.out.println("Spiral Matrix: ");
        fillSpiralMatrix(num, num);

    }
    private static void fillSpiralMatrix(int row, int col){
        int[][] matrix = new int[row][col];
        int topRow=0, rightCol=col-1, bottomRow=row-1, leftCol=0;
        int startNum = 1;
        while (startNum<=row*col){
            // topRow => leftCol -> rightCol
            for (int j=leftCol; j<=rightCol; j++){
                matrix[topRow][j] = startNum;
                startNum++;
            }
            topRow++;
            // rightCol => topRow -> bottomRow
            for (int i=topRow; i<=bottomRow; i++){
                matrix[i][rightCol] = startNum;
                startNum++;
            }
            rightCol--;
            // bottomRow => rightCol -> leftCol
            for (int j=rightCol; j>=leftCol; j--){
                matrix[bottomRow][j] = startNum;
                startNum++;
            }
            bottomRow--;
            // leftCol => bottomRow -> topRow
            for (int i=bottomRow; i>=topRow; i--){
                matrix[i][leftCol] = startNum;
                startNum++;
            }
            leftCol++;
        }
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
