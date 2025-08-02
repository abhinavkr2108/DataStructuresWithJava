package DynamicProgramming;

import java.util.Scanner;

/**
 * 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
 * 2. You are required to calculate and print the number of ways in which the fences could be painted so that not
 *      more than two fences have same colors.
 */
public class T19_PaintFences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of fences");
        int n = scanner.nextInt();
        System.out.println("Enter Number of colors");
        int k = scanner.nextInt();

        int[][] dp = new int[3][n+1];
        dp[0][2] = k;
        dp[1][2] = k*(k-1);
        dp[2][2] = dp[0][2]+dp[1][2];

        for (int j = 3; j < n+1; j++) {
            dp[0][j] = dp[1][j-1];
            dp[1][j] = (k-1)*(dp[2][j-1]);
            dp[2][j] = dp[0][j]+dp[1][j];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total Ways: ");
        System.out.println(dp[2][n]);

    }


}
