package Stacks;

import java.util.Stack;

public class T1_Basics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // <Integer>

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //Topmost element
        System.out.println(stack.peek());
        //Size
        System.out.println(stack.size());
        // Print Stack
        System.out.println(stack);
        // Delete topmost element
        stack.pop();
        System.out.println(stack);

        // Get first element
        while (stack.size()>1){
            stack.pop();
        }
        System.out.println(stack.peek());
    }
}
