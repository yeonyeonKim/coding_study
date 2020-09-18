import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] dp = new long[101][11];
        for(int i=0;i<10;i++){
            dp[1][i] = 1;
        }
        long sum =0;
        if(N==1){
            for(int i=1;i<10;i++){
                sum+=dp[N][i];
            }
            System.out.println(sum);
            return;
        }
        for(int i=2;i<=N;i++){
            for(int j=0;j<10;j++){
                if(j==0){
                    dp[i][0] = (dp[i-1][j+1])%1000000000;
                }else if(j==9){
                    dp[i][9] = (dp[i-1][j-1])%1000000000;
                }else{
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
                }
            }
        }
        for(int i=1;i<10;i++){
            sum+=dp[N][i];
        }
        System.out.println((sum)%1000000000);
    }
}
