package Recursion.RecursionOnStrings;

import java.util.Scanner;

/**
 * Check whether a given string is palindrome or not
 */

public class T3_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();
        String ans = checkPalindrome(str);
        if (str.equals(ans)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        boolean ans2 = checkPalindromeWithoutReverse(str, 0, str.length()-1);
        System.out.println(ans2);
    }

    /**
     * Time Complexity = O(N^2)
     */
    private static String checkPalindrome(String str){
        if (str.length()==0){
            return "";
        }
        String ans = checkPalindrome(str.substring(1)); // O(N)
        char ch = str.charAt(0);
        return ans+ch;
    }

    /**
     * Time Complexity = O(N)
     */
    private static boolean checkPalindromeWithoutReverse(String str, int start, int end){

        if (str.length()==0 || start>=end){
            return true;
        }
        if (str.charAt(start)==str.charAt(end)&&checkPalindromeWithoutReverse(str, start+1, end-1)){
                return true;
        }
        else {
            return false;
        }

    }
}
