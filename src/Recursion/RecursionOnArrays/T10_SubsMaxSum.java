package Recursion.RecursionOnArrays;

public class T10_SubsMaxSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int tar = 5;

        System.out.println("Count:");
        System.out.println(countSubsequencesWithTargetSum(0,arr,tar));

        System.out.println("Count 2: ");
        System.out.println(countSubs(0,0,arr,tar));

    }

    private static int countSubsequencesWithTargetSum(int curr, int[] arr, int tar) {
        if (curr>=arr.length){
            if (tar==0) return 1;
            else return 0;
        }

        int include = countSubsequencesWithTargetSum(curr+1,arr,tar-arr[curr]);
        int exclude = countSubsequencesWithTargetSum(curr+1, arr, tar);

        return include+exclude;
    }

    private static int countSubs(int idx, int currSum, int[] arr, int tar){
        if (idx>=arr.length){
            return currSum==tar?1:0;
        }

        int include = countSubs(idx+1, currSum+arr[idx], arr, tar);
        int exclude = countSubs(idx+1, currSum, arr, tar);

        return include+exclude;
    }
}
