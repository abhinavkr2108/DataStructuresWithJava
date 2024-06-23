package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T5_InsertAtBottomUsingArray {
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

        System.out.println("Enter element to be inserted at bottom");
        int num = scanner.nextInt();
        int size = stack.size();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
        stack.push(num);

        for (int i = size-1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println("Modified Stack");
        System.out.println(stack);

    }
}
