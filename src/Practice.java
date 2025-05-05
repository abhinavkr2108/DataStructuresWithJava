import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = beautifulSplits(arr);
        System.out.println(n);

    }
    public static int beautifulSplits(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] nums1 = Arrays.copyOfRange(nums, 0, i);
                int[] nums2 = Arrays.copyOfRange(nums, i, j);
                int[] nums3 = Arrays.copyOfRange(nums, j, n);

                if (isPrefix(nums1, nums2) || isPrefix(nums2, nums3)) {
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean isPrefix(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

}
