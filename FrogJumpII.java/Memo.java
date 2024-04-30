import java.util.*;
public class Memo {
    public static int solve(int idx, int arr[], int dp[], int k){
        if(idx == 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int n = arr.length;
        int minSteps = Integer.MAX_VALUE;

        for(int j=1; j<=k; j++){
            if(idx - j >= 0){
            int jumps = solve(idx-j, arr, dp, k) + Math.abs(arr[idx] - arr[idx-j]); 
            minSteps = Math.min(minSteps, jumps);
            }
        }

        return dp[idx] = minSteps;
    }
    public static void main(String[] args) {
        int arr[] = {30, 10, 60, 10, 60, 50};
        int n = arr.length;
        int k = 2;

        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1, arr, dp, k));
    }
}
