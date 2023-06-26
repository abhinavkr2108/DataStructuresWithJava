package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * For a given array, find prefix sum array :
 * By creating a new array
 * By not creating a new array
 */
public class T1_PrefixSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
//        int[] prefixArray = findPrefixSum(array);
//        System.out.println("Prefix Array: " +Arrays.toString(prefixArray));
        prefixSumWithoutNewArray(array);
        System.out.println("Prefix without new array creation: "+Arrays.toString(array));
    }

    private static int[] findPrefixSum(int[] array){
        int length = array.length;
        int[] prefixArray = new int[length];
        prefixArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixArray[i] = prefixArray[i-1]+ array[i];
        }
        return prefixArray;
    }

    private static void prefixSumWithoutNewArray(int[] array){
        int length = array.length;
        for (int i = 1; i < length; i++) {
            array[i] = array[i-1]+array[i];
        }
    }

}
