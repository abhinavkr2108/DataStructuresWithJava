package Arrays.TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * For a given non-decreasing array sort the array in such a way that
 * their squares are also non-decreasing
 */
public class T3_NonDecreasingArray {
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
        int[] ans = sortSquares(array);
        System.out.println("Sorted Square: "+ Arrays.toString(ans));
    }
    private static void reverseArray(int array[], int startIndex, int endIndex) {
        int temp;
        while (startIndex < endIndex) {
            temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static int[] sortSquares(int[] array){
        int length = array.length;
        int left=0, right= length-1;
        int[] ans = new int[length];
        int k=0;

        while (left<=right){
            if (Math.abs(array[left]) > Math.abs(array[right])){
                ans[k] = array[left]*array[left];
                k++;
                left++;
            }
            else {
                ans[k] = array[right]*array[right];
                k++;
                right--;
            }
        }
        reverseArray(ans,0,length-1);
        return ans;
    }

}
