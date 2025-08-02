package Strings;

import java.util.HashSet;
import java.util.Set;

public class T4_TwoStrings {
    public static void main(String[] args) {
        String s1 = "Abhinav";
        String s2 = "Z";

        System.out.println(compareStrings(s1, s2));
    }

    private static boolean compareStrings(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        set1.retainAll(set2);

        if (set1.isEmpty()) {
            return false;
        }
        return true;
    }
}
