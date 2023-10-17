package Sorting;

import java.util.Arrays;

/**
 * 1. Iterate through Array
 * 2. Compare 2 numbers, swap if right one is less
 * 3. After Each iteration, last number gets on right place
 * It is a stable sort and inplace algorithm
 *  Time Complexity => O(n^2)
 *  Space Complexity => o(1)
 */

public class T1_BubbleSort {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,5,4,3,2,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {1,2,5,4,2,1};
        optimizedBubbleSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    private static void bubbleSort(int[] array){
        int len = array.length;
        for (int i=0; i<len-1; i++){
            for (int j=0; j<len-i-1; j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * Optimizing Bubble sort for nearly sorted arrays
     * Take a bool value swap
     * if swap is true, continue the i loop again
     * else break
     * Time complexity (in best case) => O(N)
     */
    private static void optimizedBubbleSort(int[] array){
        int len = array.length;
        boolean isSwapped = false;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped==false){
                return;
            }
        }
    }
}
