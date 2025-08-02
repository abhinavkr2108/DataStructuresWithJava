package DynamicProgramming;

import java.util.Scanner;

public class T21_BuyAndSellStockInfiniteTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of price array");
        int n = scanner.nextInt();

        System.out.println("Enter price array: ");
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int buyDate = 0;
        int sellDate = 0;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i]>=prices[i-1]){
                sellDate++;
            } else {
                profit+= prices[sellDate]-prices[buyDate];
                buyDate=sellDate=i;
            }
        }
        profit+= prices[sellDate]-prices[buyDate];
        System.out.println("Max Profit: ");
        System.out.println(profit);
    }
}
