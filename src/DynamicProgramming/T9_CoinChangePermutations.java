package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class T9_CoinChangePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target amount:");
        int amt = scanner.nextInt();

        System.out.println("Enter number of coins: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        int[] dp = new int[amt+1];
        dp[0] = 1;

        System.out.println("Enter the coins:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i>=arr[j]){ // i not dp[i]
                    dp[i]+=dp[i-arr[j]];
                }
            }
        }

        System.out.println("DP Array: ");
        System.out.println(Arrays.toString(dp));

        System.out.println("Total Combinations to form amount:");
        System.out.println(dp[amt]);
        
    }
}
