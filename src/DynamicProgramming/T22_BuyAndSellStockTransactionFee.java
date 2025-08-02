package DynamicProgramming;

import java.util.Scanner;

public class T22_BuyAndSellStockTransactionFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of price array");
        int n = scanner.nextInt();

        System.out.println("Enter price array: ");
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        System.out.println("Enter Transaction fee: ");
        int fee = scanner.nextInt();

        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < n; i++) {
            int prevCash = cash;
            cash = Math.max(cash,hold+prices[i]-fee);
            hold = Math.max(hold,prevCash-prices[i]);
        }

        System.out.println("Max Profit: ");
        System.out.println(cash);
    }
}
