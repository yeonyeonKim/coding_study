import java.util.*;
class Main{
    static int M;
    static int N;
    static int[][] arr;
    static int[][] visited;
    static int[] dx={-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int w;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        arr = new int[101][101];
        visited = new int[101][101];
        int K = sc.nextInt();
        for(int k=0;k<K;k++){
            int lx=sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt();
            for(int i=ly;i<ry;i++){
                for(int j=lx;j<rx;j++){
                    arr[i][j]=1;
                }
            }
        }
        
        int[] answer = new int[101];
        Arrays.fill(answer,Integer.MAX_VALUE);
        int count =0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                w=0;
                if(arr[i][j]==0&&visited[i][j]==0){
                    w++;
                    visited[i][j]=1;
                    dfs(i,j);
                    answer[count] = w;
                    count++;
                }
            }
        }
        System.out.println(count);
        Arrays.sort(answer);
        for(int i=0;i<count;i++){
            System.out.print(answer[i]+" ");
        }
    }
    public static void dfs(int x,int y){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<M&&newy>=0&&newy<N){
                if(arr[newx][newy]==0&&visited[newx][newy]==0){
                    visited[newx][newy]=1;
                    w++;
                    dfs(newx,newy);
                }
            }
        }
    }
}
