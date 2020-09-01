import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] answer = new long[T];
        long[] dp = new long[101];
        for(int t =0;t<T;t++){
            int num = sc.nextInt();
            dp[1]=1;
            dp[2]=1;
            dp[3]=1;
            for(int i=4;i<=num;i++){
                dp[i] = dp[i-3]+dp[i-2];
            }
            answer[t] = dp[num];
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
