package Arrays.TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question: For a given array sort the array in such a way that:
 * Elements at starting are even
 * Elements at end are odd
 */

public class T2_SortEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter "+ n+ " Elements");
        for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(array));
        sortByParity(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void sortByParity(int[] array){
        int length = array.length;
        int left =0, right = length-1;
        while (left< right){
            if (array[left]%2==1 && array[right]%2==0){
                swap(array,left, right);
                left++;
                right--;
            }
            if (array[left]%2==0){
                left++;
            }
            if (array[right]%2==1){
                right--;
            }
        }

    }
}
