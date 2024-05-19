import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
//        int [] ar = {3,2,-3,45,23,-23,100};
//        System.out.println(maxSumOfConsecutiveKElements(ar,ar.length,3));
        int [] temp = {-1,-1,1};
//        System.out.println(Arrays.toString(temp));
//        System.out.println(isSubArrayWithGivenSum(temp,temp.length,23));
    }
    public static int maxSumOfConsecutiveKElements(int [] arr,int n, int k){
        if (k>n) return -1;
        int curMax = 0;
        for (int i=0;i<k;i++)
            curMax += arr[i];
        int res = curMax;
        for (int i = 1; i < n-k+1; i++) { // Or you can use i<=n-k
            curMax = curMax- arr[i-1] + arr[i+k-1];
            res = Math.max(curMax,res);
        }
        return res;
    }
    public static boolean isSubArrayWithGivenSum(int [] arr,int n,int sum){
        int curSum = 0;
        int start = 0;
        for (int end = 0; end < n;end++ ) {
            curSum += arr[end];
            while (curSum>sum){
                curSum = curSum - arr[start];
                start++;
            }
            if (sum==curSum) return true;
        }
        return false;
    }
}
