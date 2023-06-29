package Recursion;

import java.util.Scanner;

/**
 * Find Factorial of a number using Recursion
 */
public class T2_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of "+ num +" is: ");
        int factorial = findFactorial(num);
        System.out.println(factorial);
    }
    private static int findFactorial(int num){
        if (num==0){
            return 1;
        }
        int factorial = num*findFactorial(num-1);
        return factorial;

    }
}
