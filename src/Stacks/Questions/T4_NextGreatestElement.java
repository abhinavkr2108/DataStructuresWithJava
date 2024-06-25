package Stacks.Questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class T4_NextGreatestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = arr;
        int[] ans1 = nextGreatestElementUsingTwoLoops(arr, n);
        System.out.println("Next Greatest Element Using Two Loops");
        System.out.println(Arrays.toString(ans1));

        int[] ans2 = nextGreatestElementUsingStack(arr2,n);
        System.out.println("Next Greatest Element Using Stacks");
        System.out.println(Arrays.toString(ans2));

    }
    private static int[] nextGreatestElementUsingTwoLoops(int[] array, int size){
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i]= -1;
            for (int j = i+1; j < size; j++) {
                if(array[j]>array[i]){
                    ans[i] = array[j];
                    break;
                }

            }
        }
        return ans;
    }
    private static int[] nextGreatestElementUsingStack(int[] array, int size){
        int[] ans = new int[size];
        Stack<Integer> stack = new Stack<>();
        ans[size-1] = -1;
        stack.push(array[size-1]);

        for (int i = size-2; i >=0; i--) {
            while(!stack.isEmpty()  &&  array[i]>stack.peek()){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(array[i]);
        }

        return ans;
    }
}
