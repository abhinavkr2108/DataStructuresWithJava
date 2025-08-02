package DynamicProgramming;

import java.util.Scanner;

/**
 * 1. You are given a number h and a number c separated by a space, representing the number of houses and number of colors.
 * 2. In the next h rows, you are given c space separated numbers representing the cost of painting nth house with one of the c colors.
 * 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
 */
public class T18_PaintHouseVarColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Houses:");
        int h = scanner.nextInt();

        System.out.println("Enter Number of colors: ");
        int c = scanner.nextInt();

        int[][] arr = new int[h][c];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[h][c];

        for (int j = 0; j < c; j++) {
            dp[0][j] = arr[0][j];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
               
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < dp[0].length; k++) {
                    if (k!=j){
                        min = Math.min(min, dp[i-1][k]);
                    }
                }

                dp[i][j] = arr[i][j]+min;
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        int result = Integer.MAX_VALUE;
        for (int j = 0; j < c; j++) {
            result = Math.min(result, dp[h - 1][j]);
        }

        System.out.println("\nMinimum cost to paint all houses: " + result);
    }
}
