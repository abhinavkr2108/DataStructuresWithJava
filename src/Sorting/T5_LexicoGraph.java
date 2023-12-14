package Sorting;

import java.util.Arrays;

public class T5_LexicoGraph {
    public static void main(String[] args) {
        String[] fruits = {"kiwi", "banana", "papaya","apple","mango"};
        sortFruits(fruits);
        System.out.print(Arrays.toString(fruits));
    }

    private static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[minIndex])<0){
                    minIndex = j;
                }
            }
            var temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }
    }
}
