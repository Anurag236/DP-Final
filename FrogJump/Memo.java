import java.util.*;
public class Memo {
    public static int solve(int idx, int arr[], int dp[]){
        if(idx == 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int left = solve(idx-1, arr, dp) + Math.abs(arr[idx] - arr[idx-1]);

        int right = Integer.MAX_VALUE;
        if(idx > 1){
            right = solve(idx-2, arr, dp) + Math.abs(arr[idx] - arr[idx-2]);
        }

        return dp[idx] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10};
        int n = arr.length;

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1, arr, dp));
    }
}
