package Stacks.Questions;

import java.util.Stack;

public class T8_LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int largestArea = findLargestArea(arr,arr.length);
        System.out.println("Largest Area: "+largestArea);
    }
    private static int findLargestArea(int[] arr, int n){
        int[] lb = new int[n];
        int[] rb = new int[n];
        Stack<Integer> lStack = new Stack<>();
        Stack<Integer> rStack = new Stack<>();

        //Left Stack
        lStack.push(0);
        lb[0]=-1;
        for (int i=1;i<n;i++){
            while (!lStack.isEmpty() && arr[i]<=arr[lStack.peek()]){
                lStack.pop();
            }
            if (lStack.isEmpty()){
                lb[i] = -1;
            } else {
                lb[i]=lStack.peek();
            }
            lStack.push(i);
        }

        //Right Stack and Right Boundary
        rStack.push(n-1);
        rb[n-1] = n;

        for (int i=n-2; i>=0; i--){
            while (!rStack.isEmpty() && arr[i]<=arr[rStack.peek()]){
                rStack.pop();
            }
            if (rStack.isEmpty()){
                rb[i] = n;
            } else {
                rb[i] = rStack.peek();
            }
            rStack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rb[i] - lb[i] -1;
            int area = width*arr[i];
            if (area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }
}
