package DynamicProgramming;

import java.util.Scanner;

public class T10_Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of elements: ");
        int n = scanner.nextInt();

        int[] wts = new int[n];
        int[] vals = new int[n];

        System.out.println("Enter Weights: ");
        for (int i = 0; i < n; i++) {
            wts[i] = scanner.nextInt();
        }

        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }

        System.out.println("Enter Capacity:");
        int cap = scanner.nextInt();

        int[][] dp = new int[n+1][cap+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j<wts[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    int remCap = j-wts[i-1];
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][remCap]+vals[i-1]);
                }
            }
        }

        System.out.println("DP Matrix:");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t"); // Use \t for better spacing
            }
            System.out.println();
        }

        System.out.println("Max Value that can be taken: ");
        System.out.println(dp[n][cap]);
    }
}
