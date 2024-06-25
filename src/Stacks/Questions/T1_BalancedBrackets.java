package Stacks.Questions;

import java.util.Scanner;
import java.util.Stack;

/**
 * If brackets is unbalanced then it will return false
 * If brackets is balanced then it will return true
 */

public class T1_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println(isBalanced(str));
    }
    private static Boolean isBalanced(String string){
        Stack<Character> stack = new Stack<>();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            char ch = string.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
