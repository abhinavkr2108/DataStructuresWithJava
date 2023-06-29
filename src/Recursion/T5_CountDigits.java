package Recursion;

import java.util.Scanner;

public class T5_CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count = countDigits(num);
        System.out.println("Number of digits: "+count);
    }

    private static int countDigits(int num) {
        // Base Condition
        if (num>=0 && num<=9){
            return 1;
        }
        // RECURSIVE WORK
        int digit = countDigits(num/10);
        int count = digit+1;
        return count;
    }
}
