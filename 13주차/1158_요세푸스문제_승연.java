import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] answer = new int[N+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=N;i++){
            q.offer(i);
        }
        int count =0;
        int index =0;
        while(!q.isEmpty()){
            int num = q.remove();
            count++;
            if(count==K){
                answer[index] = num;
                index++;
                count=0;
            }else{
                q.offer(num);
            }
        }
        
        System.out.print("<");
        for(int i=0;i<N;i++){
            System.out.print(answer[i]);
            if(i!=N-1){
              System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
