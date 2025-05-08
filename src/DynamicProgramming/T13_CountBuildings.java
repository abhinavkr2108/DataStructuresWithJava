package DynamicProgramming;

import java.util.Scanner;

/**
 * Arrange Buildings and spaces on both sides of roads:
 * In such a way that
 * No Two Buildings are together
 * But we can have two spaces together
 * Pre-requisite : Count Binary Strings
 */
public class T13_CountBuildings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Buildings and spaces: ");
        int n = scanner.nextInt();

        int[][] dp = new int[2][n+1];
        dp[0][1] = 1; //Buildings
        dp[1][1] = 1; //Spaces

        for (int j = 2; j < n + 1; j++) {
            dp[0][j] = dp[1][j-1];
            dp[1][j] = dp[0][j-1] + dp[1][j-1];
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total Number of ways: ");
        int ways = dp[1][n]+dp[0][n];
        System.out.println(ways*ways);
    }
}
