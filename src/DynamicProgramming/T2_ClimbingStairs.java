package DynamicProgramming;

import java.util.Scanner;

public class T2_ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stair Number: ");
        int n = scanner.nextInt();

        System.out.println("Paths using Recursion: ");
        System.out.println(countPaths(n));

        System.out.println("Paths using DP: ");
        System.out.println(countPathsDP(n, new int[n+1]));

        System.out.println("Paths using Tabulation: ");
        System.out.println(countPathsTabulation(n));

    }

    private static int countPaths(int n){
        if (n==0) return 1;
        if (n<0) return 0;

        int p1 = countPaths(n-1);
        int p2 = countPaths(n-2);
        int p3 = countPaths(n-3);

        return p1+p2+p3;
    }

    private static int countPathsDP(int n, int[] dp){
        if (n==0) return 1;
        if (n<0) return 0;

        if (dp[n]!=0){
            return dp[n];
        }

        int p1 = countPathsDP(n-1,dp);
        int p2 = countPathsDP(n-2,dp);
        int p3 = countPathsDP(n-3,dp);

        int paths = p1+p2+p3;
        dp[n]=paths;

        return paths;
    }

    private static int countPathsTabulation(int n){
        int[] dp = new int[n+1];
        dp[0]=1;

        for (int i = 1; i <= n; i++) {
            if (i==1) dp[i] = dp[i-1];
            else if (i==2) dp[i] = dp[i-1]+dp[i-2];
            else dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];
    }
}
