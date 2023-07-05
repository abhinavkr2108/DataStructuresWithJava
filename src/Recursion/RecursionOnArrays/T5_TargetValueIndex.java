package Recursion.RecursionOnArrays;

import java.util.Scanner;

public class T5_TargetValueIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
//        int index = findIndex(array,0,tar)

    }
    private static int findIndex(int[] array, int index, int target){
        // Base Case
        if (index==array.length){
            return -1;
        }
        // Self Work (Checking the first index)
        if (array[index]==target){
            return index;
        }
        // Recursion
        return findIndex(array, index+1, target);

    }
}
