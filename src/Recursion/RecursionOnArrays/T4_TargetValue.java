package Recursion.RecursionOnArrays;

import java.util.Scanner;

/**
 * For a given array check whether a given element exists in the array or not
 */
public class T4_TargetValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Target value: ");
        int target = scanner.nextInt();
        boolean targetFound = findElement(array,0,target);
        if (targetFound) System.out.println("Element present");
        else System.out.println("Element not present");

    }
    private static boolean findElement(int[] array, int index, int target){
        // Base Case
        if (index==array.length){
            return false;
        }
        // Self Work
        if (array[index]==target){
            return true;
        }
        if (findElement(array, index+1, target)==true){
            return true;
        }
        else {
            return false;
        }
    }
}
