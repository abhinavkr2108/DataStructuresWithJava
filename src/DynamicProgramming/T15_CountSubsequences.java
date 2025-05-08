package DynamicProgramming;

import java.util.Scanner;

/**
 * Count Subsequences of form A^i B^j C^k
 * Count A+ B+ C+ Subsequences Dynamic Programming
 */
public class T15_CountSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='a'){
                a = 2*a+1;
            } else if (string.charAt(i)=='b') {
                ab = 2*ab+a;
            } else if (string.charAt(i)=='c') {
                abc = 2*abc+ab;
            }
        }

        System.out.println("Total Subsequences of form A^i B^j C^k");
        System.out.println(abc);
    }
}
