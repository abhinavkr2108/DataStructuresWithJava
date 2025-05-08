package Recursion.RecursionOnArrays;

import java.util.ArrayList;
import java.util.List;

public class T9_Subsequences {
    public static void main(String[] args) {
        int[] arr = {1,2};
        List<Integer> list = new ArrayList<>();
        printSubs(0,arr,list);

    }

    private static void printSubs(int curr, int[] arr, List<Integer> list){
        int n = arr.length;

        if (curr>= n){
            System.out.println(list);
            return;
        }

        list.add(arr[curr]);
        printSubs(curr+1,arr,list);
        list.removeLast();
        printSubs(curr+1, arr, list);

    }
}
