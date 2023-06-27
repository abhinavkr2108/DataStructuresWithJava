package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * For a given input print its Pascal's Triangle
 * Important Points:
 * 1. Each row has i-1 columns
 * 2. First and last elements of each row is 1
 * 3. Number in pascal's triangle => p[i][j] = p[i-1][j]+p[i-1][j-1]
 */
public class T6_PascalTriangle {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        var num = scanner.nextInt();
        System.out.println("Pascal Triangle: ");
        printPascalTriangle(num);

    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void printPascalTriangle(int num){
        int pascal[][] = new int[num][];
        for (int i=0; i<num; i++){
            // ith row has i+1 columns
            pascal[i] = new int[i+1];
            //First and last elements of each row is 1
            pascal[i][0] = pascal[i][i] = 1;
            // Number in pascal's triangle => p[i][j] = p[i-1][j]+p[i-1][j-1]
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }
        printMatrix(pascal);
    }
}
