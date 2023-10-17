package Sorting;

import java.util.Arrays;

/**
 * Not a stable sort
 */

public class T2_SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 7, 8, 5, 3, 9, 1, 2};
        int[] sortedArray = selectionSort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        int[] unsortedArray2 =  {10, 7, 8, 5, 3, 9, 1, 2};
        optimizedSelectionSort(unsortedArray2);
        System.out.println(Arrays.toString(unsortedArray2));
    }
    /**
     * Selection sort without using auxiliary array
     * Take minIndex as First index in input array
     * Find index of the smallest number in the remaining array
     * Swap both the numbers
     *  Time Complexity => O(n^2)
     *  Space Complexity => o(1)
     */
    private static void optimizedSelectionSort(int[] array){
        int len = array.length;
        for (int i = 0; i < len-1; i++) {
            int minIndex = i; // Start with first index. FInd the minimum in rest array
            for (int j = i+1; j < len; j++) {
                if (array[j]< array[minIndex]){
                    minIndex = j;
                }
            }
            // Swap arr[i] with arr[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    /**
     * Selection sort using auxiliary array
     * Find minIndex in input array
     * Fill the minIndex at first index of other array
     * Replace minIndex with infinity and find second minIndex
     *  *  Time Complexity => O(N^2)
     *  *  Space Complexity => O(N)
     */
    private static int[] selectionSort(int[] array){
        int len = array.length;
        int[] ansArray = new int[len];

        for (int i = 0; i < len; i++) {
            int minIndex = findMinIndex(array);
            ansArray[i] = array[minIndex];
            array[minIndex] = Integer.MAX_VALUE;
        }

        return ansArray;
    }
    private static int findMinIndex(int[] array){
        int len = array.length;
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 0; i < len; i++) {
            if (array[i]< minValue){
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }
}

