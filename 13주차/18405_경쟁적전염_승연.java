/*왜 틀렸는지 모르겠음*/
import java.util.*;
class Main{
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] arr = new int[N][N];
        int K = sc.nextInt();
        Queue<Point> q = new LinkedList<>();
        Point[] list = new Point[(N*N)];
        int index =-1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                index++;
                int num = sc.nextInt();
                arr[i][j]=num;
                list[index]=new Point(i,j,num);
            }
        }
        int max =0;
        Arrays.sort(list);
        int[] visited = new int[10001];
        for(int k =0;k<=index;k++){
          if(list[k].num!=0&&visited[list[k].num]==0){
              visited[list[k].num]=1;
              max = Math.max(list[k].num,max);
              q.offer(new Point(list[k].x,list[k].y,list[k].num));
          }
        }
        int S = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int count =0;
        while(S!=0&&!q.isEmpty()){
            Point p = q.remove();
            for(int i=0;i<4;i++){
                int newx = p.x+dx[i];
                int newy = p.y+dy[i];
                if(newx>=0&&newx<N&&newy>=0&&newy<N){
                    if(arr[newx][newy]==0){
                        arr[newx][newy] = p.num;
                        q.offer(new Point(newx,newy,p.num));
                    }
                }
            }
            if(p.num==max){
              count++;
              if(count==S){
                break;
              }
            }
            if(check(arr)==true){
                break;
            }
            
        }
        System.out.println(arr[X-1][Y-1]);
    }
    public static boolean check(int[][] arr){
      for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          if(arr[i][j]==0){
            return false;
          }
        }
      }
      return true;
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int num;
        Point(int x,int y,int num){
            this.x = x;
            this.y = y;
            this.num = num;
        }
        public int compareTo(Point p){
          if(this.num>p.num){
            return 1;
          }else if(this.num<p.num){
            return -1;
          }
          return 0;
        }
    }
}
