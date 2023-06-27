package Arrays.TwoDimensionArrays;

import java.util.Scanner;

public class T1_InitializingTwoDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array1 = new int[2][2];
        array1[0][0] =1;
        array1[0][1] =2;
        array1[1][0] =3;
        array1[1][1] =4;

        System.out.println("First Array is: ");
        printArray(array1);

        int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Second Array is: ");
        printArray(array2);

        System.out.println("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int col = scanner.nextInt();

        int[][] userInputArray = new int[row][col];
        System.out.println("Enter Elements: ");
        for (int i=0; i< row; i++){
            for (int j=0; j<col; j++){
                userInputArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your array is: ");
        printArray(userInputArray);
    }
    private static void printArray(int[][] array){
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
