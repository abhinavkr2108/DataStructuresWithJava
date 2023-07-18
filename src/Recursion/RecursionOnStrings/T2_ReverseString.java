package Recursion.RecursionOnStrings;

import java.util.Scanner;

/**
 * Reverse a given string using recursion
 */

public class T2_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        System.out.println("Reverse: ");
//        String ans = reverse(str, 0);
//        System.out.print(ans);
        String ans = reverseWithoutIndex(str);
        System.out.println(ans);
    }
    private static String reverse(String str, int index){
        if (index==str.length()){
            return "";
        }
        String ans = reverse(str, index+1);
        char ch = str.charAt(index);
        return ans+ch;
    }
    private static String reverseWithoutIndex(String str){
        if (str.length()==0){
            return "";
        }
        String ans = reverseWithoutIndex(str.substring(1));
        char ch = str.charAt(0);
        return ans+ch;
    }
}
