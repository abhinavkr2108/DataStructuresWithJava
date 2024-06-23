package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T6_DisplayStackInReverseUsingRecursion {
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
        System.out.println("Original Stack in Reverse Order");
        displayRev(stack);
        System.out.println();
    }

    private static void displayRev(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        System.out.print(x + " ");
        displayRev(stack);
    }

}
