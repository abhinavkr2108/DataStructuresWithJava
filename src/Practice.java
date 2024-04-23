import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,-5,-9,1};
        int[] newArr = separateNegativeAndPositive(arr);
        System.out.print(Arrays.toString(newArr));
        System.out.println();

        int[] prod = {1,2,3};
        int[] newArray = getProductArrayExceptSelf(prod);
        System.out.println(Arrays.toString(newArray));


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
    private static void productExceptSelf(int[] arr){
        int len = arr.length;
        int product =1;
        for (int i = 0; i < len; i++) {
            product = product*arr[i];
        }
        for (int i = 0; i < len; i++) {
            arr[i] = product/arr[i];
        }

    }
    public static int[] getProductArrayExceptSelf(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[n];
        int product = 1;
        // Product of elements at left
        for(int i=0; i<n; i++)
        {
            result[i] = product; //result[0] = 1; result[1]= 1; result[2]= 2
            product = product*arr[i];
        }
        product =1;
        // Product of elements at right
        for(int i=n-1; i>=0; i--)
        {
            result[i]= result[i]*product;
            product= product*arr[i];
        }
        return result;
    }
}
