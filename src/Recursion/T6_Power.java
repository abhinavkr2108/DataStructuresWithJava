package Recursion;

import java.util.Scanner;

/**
 * Calculate power of a number using recursion
 */
public class T6_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter its power: ");
        int pow = scanner.nextInt();
        System.out.println(num +" raised to the power "+pow +" is: ");
        int result = calculatePower(num, pow);
        int result2 = calculatePowerByDivision(num, pow);
        System.out.println(result);
        System.out.println(result2);
    }

    /**
     * Approach 1: p^q = p^q-1 * p^1
     * (p^(q-1)) => Recursion
     * Time Complexity => O(pow)
     * Space Complexity => O(pow)
     */
    private static int calculatePower(int num, int pow){
        if (pow==0){
            return 1;
        }
        return calculatePower(num, pow-1)*num;
    }
    /**
     * Approach 2:
     * p^q = p^(q/2)*p^(q/2) - if q is even
     * p^q = p^(q/2)*p^(q/2)*p - if q is odd
     * Time Complexity => O(log(pow))
     * Space Complexity => O(pow)
     */
    private static int calculatePowerByDivision(int num, int pow){
        if (pow==0){
            return 1;
        }
        if (pow%2==0){
            int multiply = calculatePowerByDivision(num, pow/2);
            int result = multiply*multiply;
            return result;
        }

        int multiply = calculatePowerByDivision(num, pow/2);
        int result = multiply*multiply*num;
        return result;

    }

}
