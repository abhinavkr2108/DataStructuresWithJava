package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T9_ReverseStackUsingRecursion {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            stack.push(x);
        }
        System.out.println("Original Stack");
        System.out.println(stack);
        System.out.println("Reverse Stack");
        reverse(stack);
        System.out.println(stack);
    }
    private static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        reverse(stack);
        pushAtBottom(stack, x);

    }
    private static void pushAtBottom(Stack<Integer> stack, int top){
        if(stack.isEmpty()){
            stack.push(top);
            return;
        }
        int x = stack.pop();
        pushAtBottom(stack, top);
        stack.push(x);
    }
}
