/*dfs로 해결*/
import java.util.*;
class Main{
    static int N;
    static int[] visited;
    static int[] arr;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        N = sc.nextInt();
        visited = new int[N+1];
        arr = new int[N+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<=N;i++){
            dfs(i);
            init();
        }
        for(int i=1;i<=N;i++){
            if(visited[i]==2){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static void dfs(int num){
        if(visited[num]==2) return;//첫번째 줄과 두번째줄이 모두 탐색된 경우임으로
        visited[num]++;
        dfs(arr[num]);//두번째 줄의 숫자를 가진 인덱스를 확인
    }
    static void init(){
        for(int i=1;i<=N;i++){
            if(visited[i]<2){//2보다 작으면 소용없음
               visited[i]=0;
            }    
        }
        
    }
}
