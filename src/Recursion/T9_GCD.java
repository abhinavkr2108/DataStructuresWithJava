package Recursion;

import java.util.Scanner;

public class T9_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int first = scanner.nextInt();
        System.out.println("Second Number: ");
        int second = scanner.nextInt();

        int min = Math.min(first, second);
        System.out.println("GCD is: ");
        int gcd1 = gcdByBruteForce(first, second, min);
        int gcd2 = gcdByLongDivision(first, second);
        int gcd3 = gcdByRecursion(first,second);
        System.out.println(gcd1);
        System.out.println(gcd2);
        System.out.println(gcd3);
        System.out.println("LCM: ");
        int lcm = (first*second)/gcd3;
        System.out.println(lcm);
    }
    private static int gcdByBruteForce(int first, int second, int min){
        for (int i=min; i>=1; i--){
            if (first%i==0 && second%i==0){
                return i;
            }
        }
        return 1;
    }
    private static int gcdByLongDivision(int first, int second){
        while (first%second!=0){
            int rem = first%second;
            first = second;
            second = rem;
        }
        return second;
    }
    private static int gcdByRecursion(int first, int second){
        // Base Case
        if (second==0){
            return first;
        }
        return gcdByRecursion(second, first%second);
    }
}
