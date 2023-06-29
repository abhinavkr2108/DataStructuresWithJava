package Recursion;

import java.util.Scanner;

/**
 * Print Fibonacci Series by recursion
 * Time Complexity = O(2^n)
 * Space Complexity = O(n)
 */
public class T3_FibonacciSeries {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        System.out.println(num +" term in fibonacci series is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) +" ");
        }

    }

    private static int fibonacci(int num) {
        if (num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        //Recursive Call
        int fib = fibonacci(num-1)+fibonacci(num-2);
        return fib;
    }
}
