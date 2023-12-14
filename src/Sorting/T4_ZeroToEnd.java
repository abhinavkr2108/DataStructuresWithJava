package Sorting;

import java.util.Arrays;

/**
 * Move all 0's to end
 * Approach: Bubble sort
 */
public class T4_ZeroToEnd {
    public static void main(String[] args) {
        int[] array = {0,5,0,3,42};
        moveZeroToEnd(array);
        System.out.print(Arrays.toString(array));
    }

    private static void moveZeroToEnd(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j]==0 && array[j+1]!=0){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
