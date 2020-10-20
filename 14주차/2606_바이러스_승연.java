import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][N+1];
        int[] visited = new int[N+1];
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s][e]=1;
            arr[e][s]=1;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1]=1;
        int ans=0;
        while(!q.isEmpty()){
            int num  = q.remove();
            for(int i=1;i<=N;i++){
                if(i==num) continue;
                if(arr[num][i]==1&&visited[i]==0){
                    visited[i] = 1;
                    q.offer(i);
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(visited[i]==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
