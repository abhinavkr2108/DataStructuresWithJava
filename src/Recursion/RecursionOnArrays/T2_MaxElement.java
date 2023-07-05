package Recursion.RecursionOnArrays;

import java.util.Scanner;

/**
 * Find maximum element in an array using recursion
 * Space Complexity = O(N)
 * Time Complexity = O(N)
 */

public class T2_MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = maxElement(array,0);
        System.out.println("Maximum Element: "+max);
    }
    private static int maxElement(int[] array, int index){
        // base case
        if (index== array.length-1){
            return array[index];
        }
        // Recursive Work
        int max = maxElement(array, index+1);
        // Self work
        return Math.max(max,array[index]);
    }
}
