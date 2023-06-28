package Arrays.TwoDimensionArrays;

import java.util.Scanner;

/**
 * For a given matrix find the sum in the given range
 * Take two coordinates from user and return the sum formed by the rectangle
 * made through the coordinates
 */
public class T9_MatrixSum {
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
        printMatrix(matrix);
        System.out.println("Enter first coordinates: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter second Coordinates: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Sum for given range is: ");
        int sum1 = findSum(matrix,x1,y1,x2,y2);
//        int sum2 = findSumByPrefixSum(matrix, x1, y1, x2, y2);
        int sum2 = findSumByRowColPrefixSum(matrix,x1,y1,x2,y2);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void findMatrixPrefixSum(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0; i<row; i++){
            for (int j=1; j<col; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        for (int j=0; j<col; j++){
            for (int i=1; i<row; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    private static int findSum(int[][] matrix, int x1, int y1, int x2, int y2){
        var sum = 0;
        for (int i=x1; i<=x2; i++){
            for (int j=y1; j<=y2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }
    private static int findSumByPrefixSum(int[][] matrix, int x1, int y1, int x2, int y2){
        int sum =0;
        findMatrixPrefixSum(matrix);
        for (int i=x1; i<=x2; i++){
            if (y1>=1) {
                sum += matrix[i][y2] - matrix[i][y1 - 1];
            }
            else {
                sum += matrix[i][y2];
            }
        }
        return sum;
    }
    private static int findSumByRowColPrefixSum(int[][] matrix, int x1, int y1, int x2, int y2){
        int ans=0, sum=0, left=0, up=0, leftUp=0;
        findMatrixPrefixSum(matrix);
        sum=matrix[x2][y2];
        if (x1>=1 && y1>=1){
            leftUp = matrix[x1-1][y1-1];
        }
        if (x1>=1){
            up = matrix[x1-1][y2];
        }
        if (y1>=1){
            left = matrix[x2][y1-1];
        }
        ans = sum-up-left+leftUp;
        return ans;
    }
}
