package Searching;

public class T5_SquareRoot {
    public static void main(String[] args) {
        int target =40;
        int root = findSquareRoot(target);
        System.out.println(root);
    }
    private static int findSquareRoot(int target){
        int st=0, end=target;
        int ans=-1;
        while (st<=end){
            int mid = st+ (end-st)/2;
            int val = mid*mid;
            if (val==target){
                return mid;
            } else if (val < target) {
                ans=mid;
                st=mid+1;
            } else {
                end=mid-1;
            }
        }
        return ans;
    }
}
