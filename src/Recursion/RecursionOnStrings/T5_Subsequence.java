package Recursion.RecursionOnStrings;

public class T5_Subsequence {
    public static void main(String[] args) {
        printSubsequence("abc", "");
    }
    private static void printSubsequence(String string, String currAns){
        if (string.length()==0){
            System.out.print(currAns +" ");
            return;
        }
        char currChar = string.charAt(0);
        String remString = string.substring(1);

        // If current character chooses to join string
        printSubsequence(remString,currAns+currChar);
        // If current character doesn't choose to join string
        printSubsequence(remString, currAns);
    }
}
