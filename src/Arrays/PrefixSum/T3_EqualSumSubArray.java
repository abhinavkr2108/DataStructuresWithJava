package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question: For a given array check whether
 * it can be partitioned into sub-arrays with equal sum
 */
public class T3_EqualSumSubArray {
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
        boolean result = equalSumPartition(array);
        if (result==true){
            System.out.println("Array can be divided into sub arrays");
        }
        else {
            System.out.println("Array cannot be divided into sub arrays");
        }
    }

    /**
     * Solution 1: Brute Fore Approach:
     *  Make prefix sum and suffix sum array
     *  if prefix[i] = suffix[i+1] return true
     */

    private static int[] prefixSumArray(int[] array){
        int[] prefixArray = new int[array.length];
        prefixArray[0] = array[0];
        for (int i=1; i< array.length; i++){
            prefixArray[i] = prefixArray[i-1]+array[i];
        }
        return prefixArray;
    }
    private static int[] suffixSumArray(int[] array){
        int[] suffixArray = new int[array.length];
        suffixArray[array.length-1] = array[array.length-1];
        for (int i= array.length-2; i>0; i--){
            suffixArray[i] = suffixArray[i+1]+array[i];
        }
        return suffixArray;
    }
    private static boolean findSubArray(int[] array){
        int[] prefixArray = prefixSumArray(array);
        int[] suffixArray = suffixSumArray(array);
        for (int i=0; i< array.length-1; i++){
            if (prefixArray[i]==suffixArray[i+1]){
                return true;
            }
        }
        return false;
    }
    /**
     *  Solution 2: Optimized Approach:
     *  Find prefix and suffix sum in the same array
     *  Find Total sum and prefix sum of array
     *  Total sum = prefix + suffix sum => suffix sum = total - prefix
     */
    private static int findArraySum(int[] array){
        int sum = 0;
        for (int i=0; i< array.length; i++){
            sum+= array[i];
        }
        return sum;
    }
    private static boolean equalSumPartition(int[] array){
        int totalSum = findArraySum(array);
        int prefixSum = 0;
        for (int i=0; i< array.length; i++){
            prefixSum += array[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum== suffixSum){
                return true;
            }
        }
        return false;
    }
}
