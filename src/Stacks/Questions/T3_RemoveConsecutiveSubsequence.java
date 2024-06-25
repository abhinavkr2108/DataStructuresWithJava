package Stacks.Questions;

import java.util.Stack;

public class T3_RemoveConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 4, 2, 2, 5, 5, 7, 8};
        int n = arr.length;
        int[] ans = removeConsecutiveDuplicates(arr, n);
        System.out.println("Modified array: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] removeConsecutiveDuplicates(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else {
               if(arr[i]==stack.peek()){
                   if(i==n-1 || arr[i]!=arr[i+1]){
                       stack.pop();
                   }
               }
            }
        }
        int ans[] = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
