import java.util.*;
class Main{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Tomato{
        int x;
        int y;
        Tomato(int x,int y){
            this.x = x;
            this.y =y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[N][M];
        int[][] visited = new int[N][M];
        int no_tomato =0;
        int cnt =0;
        Queue<Tomato> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==-1) no_tomato++;
                if(arr[i][j]==1){
                    q.offer(new Tomato(i,j));
                    cnt++;
                }
            }
        }
        if(no_tomato==N*M){
            System.out.println("-1");
            return;
        }
        if(cnt==N*M){
            System.out.println("0");
            return;
        }
        while(!q.isEmpty()){
            Tomato t = q.remove();
            for(int i=0;i<4;i++){
                int newx = t.x+dx[i];
                int newy = t.y+dy[i];
                if(newx>=0&&newx<N&&newy>=0&&newy<M){
                    if(visited[newx][newy]==0&&arr[newx][newy]==0){
                        q.offer(new Tomato(newx,newy));
                        visited[newx][newy]=visited[t.x][t.y]+1;
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==0&&visited[i][j]==0){
                    System.out.println("-1");
                    return;
                }
            }
        }
        int ans =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                ans = Math.max(ans,visited[i][j]);
            }
        }
        System.out.println(ans);
    }
}
