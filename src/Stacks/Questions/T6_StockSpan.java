package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class T6_StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] res = calculateSpan(arr,arr.length);
        System.out.println("Answer");
        System.out.println(Arrays.toString(res));
    }
    private static int[] calculateSpan(int[] arr, int n){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        ans[0] = 1;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i]>=arr[stack.peek()]){ // We are putting index
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] =i+1;
            }
            else {
                ans[i]= i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
