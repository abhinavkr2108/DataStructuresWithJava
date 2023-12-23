import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,-5,-9,1};
        int[] newArr = separateNegativeAndPositive(arr);
        System.out.print(Arrays.toString(newArr));

    }
    public static int[] separateNegativeAndPositive(int a[]) {

        int st = 0;
        int end = a.length - 1;

        while (st < end) {
            while (a[st] < 0) {
                st++;
            }
            while (a[end] >= 0) {
                end--;
            }
            if (st < end) {
                int temp = a[st];
                a[st] = a[end];
                a[end] = temp;
            }

        }

        return a;
    }
}
