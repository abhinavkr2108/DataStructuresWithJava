package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class T3_StairsVariableJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of variable jump array");
        int n = scanner.nextInt();

        int[] var = new int[n];
        for (int i = 0; i < var.length; i++) {
            var[i] = scanner.nextInt();
        }

        int[] dp = new int[n+1];
        dp[n]=1;

        System.out.println("Paths using Tabulation: ");
        System.out.println(countPathsTabulation(n,var,dp));

        // For memoization (top-down)
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println("Paths using Memoization: ");
        System.out.println(countPathsMemoization(0, n, var, memo));
    }

    private static int countPathsMemoization(int current, int n, int[] var, int[] memo) {
        if (current == n) {
            return 1;
        }

        if (current > n) {
            return 0;
        }

        if (memo[current] != -1) {
            return memo[current];
        }

        int paths = 0;

        for (int jump = 1; jump <= var[current]; jump++) {
            paths += countPathsMemoization(current + jump, n, var, memo);
        }

        memo[current] = paths;
        return paths;
    }

    private static int countPathsTabulation(int n, int[] var, int[] dp){
        for (int i = n-1; i >=0; i--) {
            for (int j = 1; j <= var[i] && i+j< dp.length; j++) {
                dp[i]+= dp[i+j];
            }
        }
        return dp[0];
    }
}
