import java.util.*;
class Main{
    static int N;
    static int[][] arr;
    static int[] visited;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new int[N+1];
        arr = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                arr[i][j]=sc.nextInt();   
            }
        }
        function(1,0);
        System.out.println(ans);
    }
    public static void function(int index,int count){
        if(index>N) return;
        if(count==N/2){
            int start =0;
            int link =0;
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(visited[i]==0&&visited[j]==0) start +=arr[i][j];
                    if(visited[i]!=0&&visited[j]!=0) link +=arr[i][j];
                }
            }
            int tmp = Math.abs(start-link);
            ans = Math.min(ans,tmp);
            return;
        }
        visited[index]=1;
        function(index+1,count+1);
        visited[index]=0;
        function(index+1,count);
    }
}
