package DynamicProgramming;

import java.util.Scanner;

public class T4_MinStairJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of variable jump array");
        int n = scanner.nextInt();

        int[] var = new int[n];
        for (int i = 0; i < var.length; i++) {
            var[i] = scanner.nextInt();
        }

        Integer[] dp = new Integer[n + 1];
        dp[n]=0;
        Integer[] memo = new Integer[n + 1];
        memo[n]=0;

        int minPaths = countMinPathsTab(n, var, dp);
        System.out.println("Minimum Paths to reach from 0 to n: ");
        System.out.println(countMinPathsMemo(0,n,var,memo));

        System.out.println("Minimum Paths to reach from 0 to n: ");
        System.out.println(minPaths);
    }

    private static int countMinPathsMemo(int curr, int n, int[] var, Integer[] memo){
        if (curr==n) return 0;
        if (curr>n) return Integer.MAX_VALUE;

        if (memo[curr]!=null) return memo[curr];

        int min = Integer.MAX_VALUE;

        for(int j=1; j<=var[curr]; j++){
            int paths = countMinPathsMemo(curr+j,n,var,memo);
            if (paths!=Integer.MAX_VALUE){
                min = Math.min(min,paths+1);
            }
        }

        memo[curr]=min;
        return min;

    }


    private static int countMinPathsTab(int n, int[] var, Integer[] dp){
        for (int i=n-1; i>=0; i--){

                int min = Integer.MAX_VALUE;
                for (int j = 1; j <=var[i]; j++) {
                    if (i+j< dp.length && dp[i+j]!=null){
                        min = Math.min(min, dp[i+j]);
                    }
                }
                if (min!=Integer.MAX_VALUE){
                    dp[i] = min+1;
                } else {
                    dp[i] = null;
                }
            }

        return dp[0];
    }
}
