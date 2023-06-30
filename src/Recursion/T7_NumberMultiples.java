package Recursion;

import java.util.Scanner;

/**
 * Print n multiples of a given number
 */
public class T7_NumberMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
        System.out.println("Multiples: ");
        int multiple = scanner.nextInt();
        System.out.println("Answer: ");
        printMultiples(num, multiple);
//        System.out.println(ans);
    }

    /**
     * Approach :
     * 5*4 = (5*3)*5
     * recursion*num
     */
    private static void printMultiples(int num, int multiple){
        if (multiple==1){
            System.out.println(num);
            return;
        }
        printMultiples(num, multiple-1);
        int result = num*multiple;
        System.out.println(result);
    }
}
