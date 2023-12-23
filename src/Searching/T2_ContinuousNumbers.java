package Searching;

public class T2_ContinuousNumbers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int target = 0;
        while (target<11){
            System.out.printf("%d exists in the array:  %b ",target,binarySearch(array,target));
            System.out.println();
            target++;
        }
    }
    private static Boolean binarySearch(int[] array, int target){
        int st=0, end=array.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (target==array[mid]){
                return true;
            } else if (target<array[mid]) {
                end = mid-1;
            } else {
                st= mid+1;
            }
        }
        return false;
    }
}
