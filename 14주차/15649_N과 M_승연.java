import java.util.*;
class Main{
    static int N;
    static int M;
    static int[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N+1];
        String ans="";
        if(M==1){
          for(int i=1;i<=N;i++){
              visited[i]=1;
              permutation(1,ans+i);
              visited[i]=0;
          }
        }
        else{
          permutation(0,ans);
        }
    }
    public static void permutation(int count,String ans){
        if(count==M){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=N;i++){
            if(visited[i]==0){
                visited[i]=1;
                permutation(count+1,ans+i+" ");
                visited[i]=0;
            }
        }
    }
}
