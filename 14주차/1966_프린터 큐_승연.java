import java.util.*;
class Main{
    static class Doc{
        int index;
        int num;
        Doc(int index, int num){
            this.index = index;
            this.num = num;
        }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] max = new int[N];
            ArrayList<Doc> q = new ArrayList<>();
            for(int i=0;i<N;i++){
                int n = sc.nextInt();
                max[i]=n;
                q.add(new Doc(i,n));
            }
            Arrays.sort(max);
            int count = 1;
            int index =N-1;
            Loop1: while(!q.isEmpty()){
                Doc d = q.get(0);
                  if(d.num<max[index]){
                      q.remove(0);
                      q.add(d);
                      continue Loop1;
                  }
                if(d.num==max[index]){
                    index--;
                }
                  if(d.index==M){
                    break Loop1;
                  }
                  count++;
                  q.remove(0);
                }
            answer[t] = count;
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
