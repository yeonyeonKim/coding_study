import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] visited = new int[100001];
        Queue<Integer> q = new LinkedList<>();
        int depth=0;
        q.add(N);
        visited[N]=1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int num = q.remove();
                if(num==K){
                    System.out.println(depth);
                    return;
                }
                if(num-1>=0&&visited[num-1]==0){
                    q.offer(num-1);
                    visited[num-1]=1;
                }
                if(num+1<=100000&&visited[num+1]==0){
                    q.offer(num+1);
                    visited[num+1]=1;
                }
                if(num*2<=100000&&visited[num*2]==0){
                    q.offer(num*2);
                    visited[num*2]=1;
                }
            }
            depth++;
        }
    }
}
