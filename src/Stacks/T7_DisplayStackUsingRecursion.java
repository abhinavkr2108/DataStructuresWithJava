package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T7_DisplayStackUsingRecursion {
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
        display(stack);
    }

    private static void display(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        display(stack);
        System.out.print(top + " ");
        stack.push(top);
    }
}
