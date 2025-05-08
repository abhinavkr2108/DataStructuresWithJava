package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Count Binary Strings which does not contain two consecutive zeroes
 */
public class T12_CountBinaryStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string length: ");
        int n = scanner.nextInt();

        int[][] dp = new int[2][n+1];
        dp[0][1] = 1;
        dp[1][1] = 1;

        for (int j = 2; j <= n; j++) {
            dp[0][j] = dp[1][j-1];
            dp[1][j] = dp[0][j-1]+dp[1][j-1];
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total Strings: ");
        System.out.println(dp[0][n]+dp[1][n]);

        System.out.println("Total Strings without the 2D Array: ");
        System.out.println(countStrings(n));
    }

    private static int countStrings(int n){
        int oldZeros = 1;
        int oldOnes = 1;

        for (int i = 2; i < n + 1; i++) {
            int newZeros = oldOnes;
            int newOnes = oldOnes+oldZeros;
            oldOnes=newOnes;
            oldZeros=newZeros;
        }
        return oldOnes+oldZeros;
    }
}
