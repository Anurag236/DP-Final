import java.util.*;   //when we have 3ways->1,2,3 chalang
public class climbB {
    public static int countWays(int n,int dp[]){
        if(n < 0){
            return 0;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countWays(n-1, dp) + countWays(n-2, dp) + countWays(n-3, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countWays(n,dp));
    }
}
