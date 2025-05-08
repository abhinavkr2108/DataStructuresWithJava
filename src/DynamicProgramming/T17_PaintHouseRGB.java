package DynamicProgramming;

import java.util.Scanner;

public class T17_PaintHouseRGB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of houses: ");
        int n = scanner.nextInt();

        int[][] arr = new int[3][n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[3][n];

        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[2][0] = arr[2][0];

        for (int j = 1; j < n; j++) {
            dp[0][j] = arr[0][j]+Math.min(dp[1][j-1],dp[2][j-1]);
            dp[1][j] = arr[1][j]+Math.min(dp[0][j-1],dp[2][j-1]);
            dp[2][j] = arr[2][j]+Math.min(dp[0][j-1],dp[1][j-1]);
        }

        System.out.println("Minimum Cost: ");
        System.out.println(Math.min(dp[0][n-1],Math.min(dp[1][n-1],dp[2][n-1])));
    }
}
