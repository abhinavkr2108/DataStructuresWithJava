package Recursion.RecursionOnArrays;

/**
 * Given an array of integers, print sums of all subsets in it. Output sums can be printed in
 * any order.
 */
public class T8_Subsets {
    public static void main(String[] args) {
        int[] array = {2,4,5};
        subsetSum(array, array.length,0,0);
    }
    private static void subsetSum(int[] array, int length, int currSum, int index){
        if (index>=length){
            System.out.print(currSum +" ");
            return;
        }
        subsetSum(array, length, currSum, index+1);
        subsetSum(array, length, currSum+array[index], index+1);
    }
}
