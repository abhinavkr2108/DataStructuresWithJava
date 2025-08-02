package Arrays;

public class T1_MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-5,6,-2,-3,1,5,-6};
        int maxSubArraySum = maxSubArraySum(arr);
        System.out.println(maxSubArraySum);
    }

    private static int maxSubArraySum(int[] arr){
        int max = arr[0];
        int currMax = arr[0];

        for(int i=1; i<arr.length; i++){
            currMax = Math.max(arr[i], arr[i]+currMax);
            max = Math.max(max, currMax);
        }

        return max;
    }
}
