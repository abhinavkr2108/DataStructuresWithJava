package Arrays;

public class T2_MaxCircularSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-5,6,-2,-3,1,5,-6};
        int maxCircularSum = maxCircularSum(arr);
        System.out.println(maxCircularSum);
    }

    private static int maxCircularSum(int[] arr){
        int totalSum=0;

        for (int i : arr) {
            totalSum+=i;
        }
        int minSubArraySum = minSubArraySum(arr);
        int maxSubArraySum = maxSubArraySum(arr);
        int maxCircularSum = totalSum-minSubArraySum;

        if (maxSubArraySum < 0) return maxSubArraySum;

        return Math.max(maxCircularSum, maxSubArraySum);

    }

    private static int maxSubArraySum(int[] arr){
        int max= arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax+arr[i]);
            max = Math.max(currMax, max);
        }
        return max;
    }

    private static int minSubArraySum(int[] arr){
        int min = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMin = Math.min(arr[i], arr[i]+currMin);
            min = Math.min(currMin, min);
        }
        return min;
    }
}
