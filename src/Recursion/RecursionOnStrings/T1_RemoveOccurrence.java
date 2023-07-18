package Recursion.RecursionOnStrings;

import java.util.Scanner;

/**
 * Remove all occurrences of letter a from a given string
 * Time Complexity = O(N^2)
 * Space Complexity = O(N)
 */
public class T1_RemoveOccurrence {
    public static void main(String[] args) {

        // Solution by iterative approach
        String string = "abcax";
        String ans ="";
        int n = string.length();
        for (int i = 0; i < n; i++) {
            if (string.charAt(i)!='a'){
                ans+=string.charAt(i);
            }
        }
        System.out.print(ans);
        System.out.println();

        //Solution by Recursion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine();
//        String answer = removeOccurrence(s, 0);
//        System.out.print(answer);
        String answer = removeWithoutIndex(s);
        System.out.print(answer);
    }
    private static String removeOccurrence(String s, int index){
        // Base Case
        if (index==s.length()){
            return "";
        }
        // Recursion
        String occ = removeOccurrence(s, index+1);
        char ch = s.charAt(index); //(Check in String and not occ)
        // Self Work
        if (ch!='a'){
            return ch+occ;
        }
        else{
            return occ;
        }
    }
    private static String removeWithoutIndex(String str){
        if (str.length()==0){
            return "";
        }

        String ans = removeWithoutIndex(str.substring(1));
        char ch = str.charAt(0);
        if (ch!='a'){
            return ch+ans; // Time Complexity => O(N) : String concatenation is not constant time operation
        }
        else{
            return ans;
        }
    }
}
