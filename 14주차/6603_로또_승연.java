import java.util.*;
class Main{
    static int[] arr;
    static int[] visited;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            N = sc.nextInt();
            if(N==0) break;
            arr = new int[N];
            visited = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            dfs(0,0);
            System.out.println();
        }
    }
    public static void dfs(int count , int start){
        if(count==6){
            for(int i=0;i<N;i++){
                if(visited[i]==1){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        for(int i=start;i<N;i++){
            if(visited[i] ==0){
                visited[i] =1;
                dfs(count+1,i+1);
                visited[i] = 0;
            }
        }
    }
}
