package Recursion.RecursionOnArrays;

import java.util.Scanner;

/**
 * Given an array and target. Print all the indices where target is present
 */

public class T6_AllIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        findIndex(array,0,target);
    }
    private static void findIndex(int[] array, int index, int target){
        if (index==array.length){
            return;
        }
        if (array[index]==target){
            System.out.print(index +" ");
        }
        findIndex(array, index+1, target);
    }
}
