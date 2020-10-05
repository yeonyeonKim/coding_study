import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100002];
        int[] dp = new int[100002];
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();  
            ans = Math.max(arr[i],ans);
        }
        dp[1] = arr[1];
        for(int i=2;i<=N;i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            ans = Math.max(dp[i],ans);
            
        }
        System.out.println(ans);
    }
}
