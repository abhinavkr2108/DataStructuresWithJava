package Recursion.RecursionOnStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class T4_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        var ans = findSubsequence(str);
        System.out.println("Subsequences of given string: ");
        System.out.print(ans);
    }
    private static ArrayList<String> findSubsequence(String string){
        var ans = new ArrayList<String>();
        if (string.length()==0){
            ans.add("");
            return ans;
        }
        var list = findSubsequence(string.substring(1));
        var ch = string.charAt(0);
        for (String s: list){
            ans.add(s);
            ans.add(ch+s);
        }
        return ans;
    }
}
