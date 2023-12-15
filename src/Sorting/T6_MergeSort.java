package Sorting;

import java.util.Arrays;

public class T6_MergeSort {
    public static void main(String[] args) {
        int[] array = {7,20,4,11,8,2};
        mergeSort(0, array.length-1, array);
        System.out.print(Arrays.toString(array));
    }

    private static void mergeSort(int l, int r, int[] array){
        if (l>=r){
            return;
        }
        int mid = (l+r)/2;
        // Sort the left array using recursion
        mergeSort(l,mid,array);
        // Sort the right array using recursion
        mergeSort(mid+1,r,array);
        // Merge the sorted arrays
        mergeArray(l,mid,r,array);
    }

    private static void mergeArray(int l, int mid, int r, int[] array){
        // length of left and right arrays
        int leftLength = mid-l+1;
        int rightLength = r-mid;

        // initialize left and right arrays
        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        // Fill the left and right arrays
        int i,j,k;
        for(i=0;i<leftLength;i++){
            left[i] = array[l+i];
        }
        for (j=0;j<rightLength;j++){
            right[j] = array[mid+1+j];
        }
        i=0; j=0; k=l; /** k is initialized with left **/

        // Start filling the main array
        while (i<leftLength && j<rightLength){
            if (left[i]<right[j]){
                array[k] = left[i];
                k++;
                i++;
            }
            else {
                array[k] = right[j];
                k++;
                j++;
            }
        }
        while (i<leftLength){
            array[k] = left[i];
            k++;
            i++;
        }
        while (j<rightLength){
            array[k] = right[j];
            k++;
            j++;
        }
    }
}
