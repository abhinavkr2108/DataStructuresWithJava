package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T8_PushAtBottomUsingRecursion {
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
        System.out.println("Enter element to be inserted at bottom");
        int num = scanner.nextInt();
        System.out.println("Original Stack");
        pushAtBottom(stack, num);
    }

    private static void pushAtBottom(Stack<Integer> stack, int x){
        if(stack.isEmpty()){
            stack.push(x);
            System.out.print(x + " ");
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, x);
        System.out.print(top + " ");
        stack.push(top);
    }
}
