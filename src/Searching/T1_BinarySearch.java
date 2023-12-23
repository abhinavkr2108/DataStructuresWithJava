package Searching;

public class T1_BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        Boolean exists = binarySearch(array,target);
        if (exists==true){
            System.out.println("Element exists in array");
        } else {
            System.out.println("Element does not exist");
        }
    }
    private static Boolean binarySearch(int[] array, int target){
        int len = array.length;
        int st = 0;
        int end = len-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (target==array[mid]){
                return true;
            } else if (target<array[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
}
