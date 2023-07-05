package Recursion.RecursionOnArrays;

import java.util.Scanner;

public class T1_TraverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements of Array: ");
        printArrayByRecursion(array,0);
    }
    private static void printArrayByRecursion(int[] array, int index){
        // Base Case
        if (index== array.length){
            return;
        }
        // Self Work
        System.out.print(array[index]+" ");
        // Recursion
        printArrayByRecursion(array, index+1);

    }
}
