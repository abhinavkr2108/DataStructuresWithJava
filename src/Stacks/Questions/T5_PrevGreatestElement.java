package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class T5_PrevGreatestElement {
    public static void main(String[] args) {
        int[] arr = {50,80,60,75,40,90};
        int[] res = prevGreatElement(arr);
        System.out.println("Answer");
        System.out.println(Arrays.toString(res));
    }
    private static int[] prevGreatElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        ans[0] = -1;
        stack.push(arr[0]);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i]> stack.peek() ){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i]=-1;
            } else {
                ans[i]= stack.peek();
            }
            stack.push(arr[i]);

        }
        return ans;
    }
}
