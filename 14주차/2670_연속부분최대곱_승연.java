import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] dp = new double[1000001];
        double max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            dp[i] = sc.nextDouble();
            max = Math.max(max, dp[i]);
        }
        
        for(int i=1;i<N;i++){
            dp[i] = Math.max(dp[i],dp[i]*dp[i-1]);
            max = Math.max(max,dp[i]);
        }
        String ans = String.format("%.3f",max);
        System.out.println(ans);
    }
}
