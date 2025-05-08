package DynamicProgramming;

import java.util.Arrays;

public class T16_MaxSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int[] dp = new int[arr.length+1];

        Arrays.fill(dp,-1);

        System.out.println("Memoization");
        System.out.println(maxSumMem(0,arr,dp));

        System.out.println("Tabulation: ");
        System.out.println(maxSumTab(arr));
    }

    private static int maxSumMem(int curr, int[] arr, int[] dp){
        if (curr>= arr.length){
            return 0;
        }
        if (dp[curr]!=-1) return dp[curr];

        int inc = maxSumMem(curr+2,arr,dp) + arr[curr];
        int exc = maxSumMem(curr+1,arr,dp);

        int max = Math.max(inc,exc);
        dp[curr] = max;
        return dp[curr];
    }

    private static int maxSumTab(int[] arr){
        int n = arr.length;

        if (n==0) return 0;
        if (n==1) return 1;

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }

        return dp[n-1];
    }
}
