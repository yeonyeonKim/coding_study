import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            int[][] arr = new int[3][N+2];
            int[][] dp = new int[3][N+2];
            for(int i=1;i<3;i++){
                for(int j =1;j<=N;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            dp[1][1]=arr[1][1];
            dp[2][1]=arr[2][1];
            for(int i=0;i<=N;i++){
                dp[0][i]=0;
            }
            dp[1][0]=0;
            dp[2][0]=0;
            int ans =0;
            for(int i=2;i<=N;i++){
                dp[1][i] = Math.max(dp[2][i-2],dp[2][i-1])+arr[1][i];
                dp[2][i] = Math.max(dp[1][i-2],dp[1][i-1])+arr[2][i];
            }
            ans = Math.max(dp[1][N],dp[2][N]);
            answer[t] = ans;
        }
        for(int t =0;t<T;t++){
            System.out.println(answer[t]);
        }
    }
}
