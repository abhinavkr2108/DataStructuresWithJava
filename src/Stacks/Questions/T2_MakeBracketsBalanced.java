package Stacks.Questions;

import java.util.Scanner;
import java.util.Stack;

/**
 * If brackets are unbalanced then
 * how many brackets should be removed to make it balanced
 */
public class T2_MakeBracketsBalanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(makeBalanced(string));
    }
    private static int makeBalanced(String string){
        int n= string.length();
        int count=0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(string.charAt(i)=='('){
                char ch = string.charAt(i);
                stack.push(ch);
                count++;
            }
            else{
                if(stack.isEmpty() || stack.peek()==')'){
                    stack.push(')');
                    count++;
                }
                else {
                    stack.pop();
                    count--;
                }
            }
        }
        return count;
    }
}
