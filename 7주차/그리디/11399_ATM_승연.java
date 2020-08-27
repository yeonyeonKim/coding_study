import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dp[0]=arr[0];
        int sum =dp[0];
        for(int i=1;i<N;i++){
            dp[i] = arr[i]+dp[i-1];
            sum+=dp[i];
        }
        System.out.println(sum);
    }
}
