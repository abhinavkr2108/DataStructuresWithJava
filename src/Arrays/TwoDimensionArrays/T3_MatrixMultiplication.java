package Arrays.TwoDimensionArrays;

import java.util.Scanner;

public class T3_MatrixMultiplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first matrix rows: ");
        int firstRow = scanner.nextInt();
        System.out.println("Enter second matrix rows: ");
        int secondRow = scanner.nextInt();
        System.out.println("Enter first matrix columns: ");
        int firstCol = scanner.nextInt();
        System.out.println("Enter second matrix columns: ");
        int secondCol = scanner.nextInt();

        System.out.println("Enter first Matrix");
        int[][] firstMatrix =  matrixInput(firstRow,firstCol);
        System.out.println("Enter second Matrix");
        int[][] secondMatrix = matrixInput(secondRow,secondCol);

        multiplyMatrix(firstMatrix, secondMatrix, firstRow, secondRow, firstCol, secondCol);

    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] matrixInput(int row, int col){
        int[][] matrix = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    private static void multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix, int firstRow, int secondRow, int firstCol, int secondCol){
        if (firstCol!= secondRow){
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int[][] ansMatrix = new int[firstRow][secondCol];
        for (int i=0; i<firstRow; i++){
            for (int j=0; j<secondCol; j++){
                for (int k=0; k<firstCol; k++){
                    // Row of matrix 1 * col of matrix 2
                    ansMatrix[i][j] += (firstMatrix[i][k] * secondMatrix[k][j]);
                }
            }
        }
        System.out.println("Multiplication of matrices is: ");
        printMatrix(ansMatrix);
    }
}
