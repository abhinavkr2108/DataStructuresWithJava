package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class T2_CopyToAnotherStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = scanner.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            stack1.push(x);
        }
        System.out.println("Original Stack");
        System.out.println(stack1);

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println("Copied Stack in Reverse Order");
        System.out.println(stack2);

        while (!stack2.isEmpty()){
            stack3.push(stack2.pop());
        }
        System.out.println("Original Copied Stack");
        System.out.println(stack3);
    }
}
