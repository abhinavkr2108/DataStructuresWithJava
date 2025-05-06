package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class T8_CoinChangeCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target value: ");
        int amt = scanner.nextInt();

        System.out.println("Enter Number of coins: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[amt+1];
        dp[0] = 1;

        System.out.println("Enter the amount values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j]+= dp[j-arr[i]];
            }
        }

        System.out.println("DP Array: ");
        System.out.println(Arrays.toString(dp));

        System.out.println("Total Combinations to form amount:");
        System.out.println(dp[amt]);
    }
}
