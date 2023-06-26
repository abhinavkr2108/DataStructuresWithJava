package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class T2_PrefixSumWithQuery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n+1];

        System.out.println("Enter " + n + " Elements");
        for (int i = 1; i <= n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter query: ");
        int query = scanner.nextInt();
        System.out.println("Original Array: " + Arrays.toString(array));
        takeUserQuery(array,query);
    }

    private static int[] findPrefixSumArray(int[] array){
        for (int i=1; i< array.length; i++){
            array[i] = array[i-1]+array[i];
        }
        return array;
    }

    private static void takeUserQuery(int[] array, int query){
        Scanner sc = new Scanner(System.in);
        int[] prefixArray = findPrefixSumArray(array);
        while (query-- > 0){
            System.out.println("Start Range: ");
            int startRange = sc.nextInt();
            System.out.println("End Range: ");
            int endRange = sc.nextInt();

            int ans = prefixArray[endRange]-prefixArray[startRange-1];
            System.out.println("Sum of elements in given range: "+ans);
        }
    }
}
