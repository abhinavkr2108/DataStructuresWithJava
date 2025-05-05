package DynamicProgramming;

import java.util.Scanner;

public class T7_TargetSumSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter target sum: ");
        int tar = scanner.nextInt();

        boolean[][] dp = new boolean[n+1][tar+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 && j==0){
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j==0){
                    dp[i][j] = true;
                } else {
                    if (dp[i-1][j]==true){
                        dp[i][j] = true;
                    } else {
                        int val = arr[i-1];
                        if (j>=val){
                            if (dp[i-1][j-val]==true){
                                dp[i][j] = true;
                            }
                        }
                    }

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
    }
}
