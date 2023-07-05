package Recursion.RecursionOnArrays;

import java.util.Scanner;

/**
 * Sum of elements of array using recursion
 * Space Complexity = O(N)
 * Time Complexity = O(N)
 */
public class T3_SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = arraySum(array,0);
        System.out.println("Sum of elements: "+sum);
    }
    private static int arraySum(int[] array, int index){
        // Base Case
        if (index==array.length){
            return 0;
        }
        // RECURSIVE WORK
        int num = arraySum(array, index+1);
        // Self Work
        return array[index]+num;
    }
}
