import java.util.*;
public class fib{
    public static int fib(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }

    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];  //0,0,0,0
        System.out.println(fib(n,dp));
        System.out.println(fibTabulation(n));
        System.out.println();
    }
}