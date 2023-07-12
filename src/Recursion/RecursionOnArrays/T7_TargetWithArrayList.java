package Recursion.RecursionOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class T7_TargetWithArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        var list = findIndex(array,0,target);
        System.out.print(list);
    }
    private static ArrayList<Integer> findIndex(int[] array, int index, int target){
        if (index==array.length){
            return new ArrayList<>();
        }
        var list = new ArrayList<Integer>();
        if (array[index]==target){
            list.add(index);
        }
        var ans = findIndex(array, index+1, target);
        list.addAll(ans);
        return list;

    }
}
