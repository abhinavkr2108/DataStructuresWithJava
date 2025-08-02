package DynamicProgramming;

import java.util.Scanner;

public class T20_BuyAndSellStockOneTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of price array");
        int n = scanner.nextInt();

        System.out.println("Enter price array: ");
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;
        int currProfit = 0;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }
            currProfit = prices[i]-minPrice;
            if (currProfit>maxProfit){
                maxProfit = currProfit;
            }
        }

        System.out.println("Max Profit: ");
        System.out.println(maxProfit);
    }
}
