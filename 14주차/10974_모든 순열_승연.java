import java.util.*;
class Main{
    static int N;
    static int[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new int[N+1];
        String ans = "";
        permutation(0,ans);
    }
    public static void permutation(int count, String ans){
        if(count==N){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=N;i++){
            if(visited[i]==0){
                visited[i] =1;
                permutation(count+1,ans+i+" ");
                visited[i] =0;
            }
        }
    }
}
