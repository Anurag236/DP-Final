import java.util.*;
public class Tab {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10};
        int n = arr.length;

        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        
        dp[0] = 0;
        for(int idx=1; idx<n; idx++){
            int left = dp[idx-1] + Math.abs(arr[idx] - arr[idx-1]);

            int right = Integer.MAX_VALUE;
            if(idx > 1){
                right = dp[idx-2] + Math.abs(arr[idx] - arr[idx-2]);
            }

            dp[idx] = Math.min(left, right);
        }

        System.out.println(dp[n-1]);
    }
}
