package DynamicProgramming;

import java.util.Scanner;

public class T6_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = scanner.nextInt();
        System.out.println("Enter Columns: ");
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];
        int[][] dp = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int j=dp[0].length-1; j>=0; j--){
            for (int i = 0; i < dp.length; i++) {
                if (j==dp[0].length-1){
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j+1]) + arr[i][j];
                } else if (i== dp.length-1) {
                    dp[i][j] = Math.max(dp[i][j+1],dp[i-1][j+1]) + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1])) + arr[i][j];
                }
            }
        }

        int max = dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0]>max){
                max = dp[i][0];
            }
        }

        System.out.println("DP Matrix:");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t"); // Use \t for better spacing
            }
            System.out.println();
        }

        System.out.println("Max gold that can be taken: ");
        System.out.println(max);


    }

}
