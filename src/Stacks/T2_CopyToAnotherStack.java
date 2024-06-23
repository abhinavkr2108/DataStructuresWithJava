package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Copy Contents of One Stack to Another in same order
 * Approach: Using Two Stacks
 * Copy contents to first stack (contents will be in reverse order)
 * Again copy contents to second stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class T2_CopyToAnotherStack {
    public static void main(String[] args) {
        int elements;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        elements = scanner.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for (int i = 0; i < elements; i++) {
            int x = scanner.nextInt();
            stack1.push(x);
        }
        System.out.println("Original Stack");
        System.out.println(stack1);
        // Copy contents to first stack
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println("Reversed Stack");
        System.out.println(stack2);
        // Again copy contents to second stack
       while(!stack2.isEmpty()){
           stack3.push(stack2.pop());
       }
        System.out.println("Copied Stack");
        System.out.println(stack3);

    }
}
