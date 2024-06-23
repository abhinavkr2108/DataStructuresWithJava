package Stacks;

import java.util.Stack;

public class T1_Basics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Adding Elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //Display Stack
        System.out.println(stack);
        // Get Topmost Element
        System.out.println(stack.peek());

        //Remove topmost element
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
