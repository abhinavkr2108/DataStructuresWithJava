package Searching;

public class T3_RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        Boolean exists = binarySearchRecursion(array,0,array.length-1,target);
        if (exists==true){
            System.out.println("Element exists in array");
        } else {
            System.out.println("Element does not exist");
        }

    }
    private static Boolean binarySearchRecursion(int[] array, int start, int end, int target){
        if (start>end){
            return false;
        }
        int mid = (start+end)/2;
        if (target==array[mid]){
            return true;
        } else if (target < array[mid]) {
            return binarySearchRecursion(array,start,mid-1,target);
        } else{
            return binarySearchRecursion(array,mid+1,end,target);
        }
    }
}
