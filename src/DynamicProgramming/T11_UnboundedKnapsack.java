package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class T11_UnboundedKnapsack {
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

        int[] dp = new int[cap+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=wts[j]){
                    dp[i] = Math.max(dp[i], dp[i-wts[j]]+vals[j]);
                }

                /**
                 * Incorrect:
                 * dp[i] = Math.max(vals[j], dp[i - wts[j]] + vals[j]);
                 * dp[i] not vals[j]
                 */

            }
        }

        System.out.println(Arrays.toString(dp));
        System.out.println("Maximum value: " + dp[cap]);


    }
}
