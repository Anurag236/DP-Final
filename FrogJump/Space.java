import java.util.*;
public class Space {
    public static void main(String[] args) {
        int arr[] = {30, 10, 60, 10, 60, 50};
        int n = arr.length;

        int prev = 0;
        int prev2 = 0;

        for(int idx=1; idx<n; idx++){
            int left = prev + Math.abs(arr[idx] - arr[idx-1]);

            int right = Integer.MAX_VALUE;
            if(idx > 1){
                right = prev2 + Math.abs(arr[idx] - arr[idx-2]);
            }

            int curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;
        }

        System.out.println(prev);
    }
}
