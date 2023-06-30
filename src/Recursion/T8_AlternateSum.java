package Recursion;

import java.util.Scanner;

/**
 * For a given number n, find the sum of all natural numbers upto n with alternate sign
 * n=5 => 1-2+3-4+5 = 3
 * Time and space complexity => O(N)
 */
public class T8_AlternateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        int num = scanner.nextInt();
        System.out.println("Alternate sum: ");
        int result = printAlternateSum(num);
        System.out.println(result);
    }

    private static int printAlternateSum(int num) {
        // Base Case
        if (num==1){
            return num;
        }
        // Recursion
        int sum = printAlternateSum(num-1);
        // Work
        if (num%2==0){
            int result = sum-num;
            return result;
        }
        int result = sum+num;
        return result;
    }
}
