package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T4_InsertAtAnyIndex {
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

        System.out.println("Enter index to insert: ");
        int index = scanner.nextInt();
        System.out.println("Enter number to insert: ");
        int num = scanner.nextInt();
        for (int i = stack1.size(); i >= index; i--) {
            stack2.push(stack1.pop());
        }
        stack1.push(num);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        System.out.println("Modified Stack");
        System.out.println(stack1);
    }
}
