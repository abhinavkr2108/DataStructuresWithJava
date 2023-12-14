package Sorting;

import java.util.Arrays;

public class T3_InsertionSort {
    public static void main(String[] args) {
        int[] array = {55,33,90,67,41};
        insertionSort(array);
        System.out.print(Arrays.toString(array));
    }

    private static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j=i; // Unsorted array begins with index 1
            while (j>0 && array[j]<array[j-1]){  // Check j>0 first
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }
}
