package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class T14_DecodeWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String of numbers: ");
        String string = scanner.next();

        int[] dp = new int[string.length()];
        dp[0]=1;

        for (int i = 1; i < dp.length; i++) {
            if (string.charAt(i-1)=='0' && string.charAt(i)=='0'){
                dp[i]=0;
            } else if (string.charAt(i-1)!='0' && string.charAt(i)=='0'){
                if (string.charAt(i-1)=='1'|| string.charAt(i-1)=='2'){
                    if (i>=2){
                        dp[i] = dp[i-1]+dp[i-2];
                    } else {
                        dp[i] = dp[i-1]+1;
                    }

                } else{
                    dp[i] = dp[i-1];
                }
            } else if (string.charAt(i-1)=='0' && string.charAt(i)!='0'){
                dp[i]=dp[i-1];
            } else if (string.charAt(i-1)!='0' && string.charAt(i)!='0'){
                if (Integer.parseInt(string.substring(i-1,i+1))<=26){
                    if (i>=2){
                        dp[i] = dp[i-1]+dp[i-2];
                    } else {
                        dp[i] = dp[i-1]+1;
                    }
                } else {
                    dp[i] = dp[i-1];
                }
            }

        }
        System.out.println("Number of ways: ");
        System.out.println(dp[string.length()-1]);

        System.out.println("DP Array: ");
        System.out.println(Arrays.toString(dp));
    }
}
