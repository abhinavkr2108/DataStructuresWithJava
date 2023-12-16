package Sorting;

import java.util.Arrays;

public class T7_QuickSort {
    public static void main(String[] args) {
        int[] array = {10,5,7,18,2,3};
        quickSort(array,0,array.length-1);
        System.out.println("Sorted Array: ");
        System.out.print(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int st, int end){
        // Base Case
        if (st>=end){
            return;
        }
        // pivot index
        int pi = partition(array, st, end);
        // Sort left and right parts using recursion
        quickSort(array, st, pi);
        quickSort(array, pi+1, end);
    }

    private static int partition(int[] array, int st, int end){
        // Take pivot number as start index
        int pivot = array[st];
        // count no. of elements smaller than pivot
        int countLess = 0;
        for (int i = st+1; i<=end; i++){
            if (array[i]<pivot){
                countLess++;
            }
        }
        // find the pivot index
        int pivotIndex = st+countLess;
        // Swap pivot with the number
        swap(array,st,pivotIndex);
        // while loop for arranging elements in correct order
        int i=st;
        int j= end;
        while (i<pivotIndex && j>pivotIndex){
            while (array[i]<=pivot) i++;
            while (array[j]>pivot) j--;
            if (i<pivotIndex && j>pivotIndex){
                swap(array,i,j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    private static void swap(int[] array, int st, int end){
        int temp = array[st];
        array[st] = array[end];
        array[end] = temp;
    }
}
