package Searching;

public class T4_FirstOccurrence {
    public static void main(String[] args) {
        int[] array ={0,1,1,1,2,2,2,5,7,7,9};
        int target = 7;

        int fo = firstOccurrence(array,target);
        int lo = lastOccurrence(array,target);
        if (fo==-1){
            System.out.println("Element doesn't exist");
        } else {
            System.out.println("First occurence of target is: "+ fo);
            System.out.println("Last occurence of target is: "+ lo);
        }

    }
    private static int firstOccurrence(int[] array, int target){
        int st=0, end=array.length-1;
        int fo=-1;
        while (st<=end){
            int mid = st + (end-st)/2;
            if (target==array[mid]){
                fo=mid;
                end=mid-1;
            } else if (target < array[mid]) {
                end=mid-1;
            } else {
                st=mid+1;
            }
        }
        return fo;
    }
    private static int lastOccurrence(int[] array, int target){
        int lo=-1;
        int st=0, end=array.length-1;
        while (st<=end){
            int mid = st+ (end-st)/2;
            if (target==array[mid]){
                lo=mid;
                st=mid+1;
            } else if (target < array[mid]) {
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return lo;
    }
}
