package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Question: Insert a number at the bottom of the given stack
 * Approach: Take another stack and push all the elements of first stack to it.
 * Then push the given number to the bottom of the first stack and then push all the elements from the second stack to it
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class T3_InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(); // <Integer>
        Stack<Integer> stack2 = new Stack<>(); // <Integer>

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            stack1.push(x);
        }
        System.out.println("Original Stack");
        System.out.println(stack1);

        System.out.println("Enter number to insert at bottom: ");
        int num = scanner.nextInt();

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
