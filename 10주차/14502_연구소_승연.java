import java.util.*;
class Main{
    static class Virus{
        int x;
        int y;
        Virus(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static ArrayList<Virus> list = new ArrayList<>();
    static ArrayList<Virus> v_list = new ArrayList<>();
    static int ans = Integer.MIN_VALUE;
    static int N;
    static int M;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        visited = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==0){
                    list.add(new Virus(i,j));
                }
                if(arr[i][j]==2){
                    v_list.add(new Virus(i,j));
                }
            }
        }
        function(0,0);
        System.out.println(ans);
    }
    public static void function(int index,int count){
        
        if(count==3){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    visited[i][j]=0;
                }
            }
            bfs();
            return;
        }
        if(index>=list.size()) return;
        Virus v = list.get(index);
        arr[v.x][v.y]=1;
        function(index+1,count+1);
        arr[v.x][v.y]=0;
        function(index+1,count);
    }
    public static void bfs(){
        Queue<Virus> q = new LinkedList<>();
        for(int i=0;i<v_list.size();i++){
            q.offer(new Virus(v_list.get(i).x,v_list.get(i).y));
        }
        while(!q.isEmpty()){
            Virus v = q.remove();
            for(int i=0;i<4;i++){
                int newx = v.x+dx[i];
                int newy = v.y+dy[i];
                if(newx>=0&&newx<N&&newy>=0&&newy<M&&visited[newx][newy]==0&&arr[newx][newy]==0){
                    visited[newx][newy]=1;
                    q.offer(new Virus(newx,newy));
                }
            }
        }
        int cnt =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==0&&visited[i][j]==0){
                    cnt++;
                }
            }
        }
        ans = Math.max(cnt,ans);
    }
}
