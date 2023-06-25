package Arrays.TwoPointers;
import java.util.Arrays;
import java.util.Scanner;

public class T1_SortZeroAndOne {
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
//        sortZeroAndOne(array);
//        System.out.println("Sorted Array: "+ Arrays.toString(array));
        sortUsingTwoPointers(array);
        System.out.println("Sorted Array using Two Pointers: "+ Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sortZeroAndOne(int[] array){
        int length = array.length;
        int countZero = 0;
        /**
         * Step 1: Count number of 0's
         * Traverse the array and increment count
         */
        for (int i=0; i<length; i++){
            if(array[i]==0){
                countZero++;
            }
        }
        /**
         * Step 2: Fill initial positions with 0's
         */
        for (int i=0; i<length; i++){
            if (i< countZero){
                array[i] =0;
            }
            else {
                array[i] = 1;
            }
        }
    }

    public static void sortUsingTwoPointers(int[] array){
        int length = array.length;
        int left = 0;
        int right = length-1;
        while(left< right){
            if (array[left]==1 && array[right]==0){
                swap(array, left, right);
                left++;
                right--;
            }
            if (array[left]==0){
                left++;
            }
            if (array[right]==1){
                right--;
            }
        }
    }
}
