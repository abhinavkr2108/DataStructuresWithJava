package Recursion;

import java.util.Scanner;

/**
 * Find sum of digits in a number using recursion
 */
public class T4_DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Sum of digits of number is: ");
        int sum = sumOfDigits(num);
        System.out.println(sum);
    }
    /**
     * Approach:
     * Last Digit = num%10
     * Rest digits = num/10
     * Ex: 1234 => 1234/10 = 123 && 1234%10 = 4
     * Repeat Process using recursion
     */
    private static int sumOfDigits(int num){
        if (num>=0 && num<=9){
            return num;
        }
        int lastDigit = sumOfDigits(num%10);
        int restDigits = sumOfDigits(num/10);
        int sum = restDigits + lastDigit;
        return sum;
    }
}
