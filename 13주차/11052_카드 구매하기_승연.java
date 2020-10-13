import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dp = new long[1001];
        int[] arr = new int[1001];
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
            dp[i] = arr[i];
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                    dp[i] = Math.max(dp[i],dp[i-j]+arr[j]);   
            }
        }
        long max = arr[1]*N;
        for(int i=1;i<=N;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
