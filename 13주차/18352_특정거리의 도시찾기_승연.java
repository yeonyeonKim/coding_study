import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int[] dist = new int[N+1];
        Arrays.fill(dist,-1);
        for(int i=0;i<=N;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        Queue<Integer> q = new LinkedList<>();
        dist[X]=0;
        q.offer(X);
        while(!q.isEmpty()){
            int num = q.remove();
            for(int i=0;i<list.get(num).size();i++){
                int next = list.get(num).get(i);
                if(dist[next]==-1){
                    dist[next]=dist[num]+1;
                    q.offer(next);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(dist[i]==K){
                ans.add(i);
            }
        }
        if(ans.size()==0){
            System.out.println("-1");
            return;
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
