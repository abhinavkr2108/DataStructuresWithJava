package Recursion;

import java.util.Scanner;

/**
 *  Print natural numbers from 1 to n using Recursion
 *  Time Complexity = O(n)
 *  Space Complexity = O(n)
 *  Space complexity is not constant because Program maintains a stack frame
 */
public class T1_PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Natural Numbers in the given range: ");
        printNaturalNum(n);

    }
    private static void printNaturalNum(int num){
        if (num==1){
            System.out.println(1);
            return;
        }
        System.out.println(num);
        printNaturalNum(num-1);

    }
}
