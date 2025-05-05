package DynamicProgramming;

import java.util.Scanner;

public class T1_Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci Number: ");
        n = scanner.nextInt();

        int fibSum = fibonacci(n);
        int fibDP = fibonacciDp(n, new int[n+1]);

        System.out.println("Fibonacci using recursion: ");
        System.out.println(fibSum);

        System.out.println("Fibonacci using Dynamic Programming: ");
        System.out.println(fibDP);


    }

    private static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }

        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);
        int fib = fib1+fib2;
        return fib;
    }

    private static int fibonacciDp(int n, int[] dp){
        if (n==0 || n==1){
            return n;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        int fib1 = fibonacciDp(n-1,dp);
        int fib2 = fibonacciDp(n-2,dp);
        int fib = fib1+fib2;

        dp[n]=fib;
        return fib;
    }
}
