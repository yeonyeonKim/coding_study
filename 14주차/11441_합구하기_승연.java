import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            int  num = sc.nextInt();
            if(i==0){
                arr[i] = num;
            }else{
                arr[i] = arr[i-1]+num;
            }
        }
        int M = sc.nextInt();
        long[] answer = new long[M];
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            if(s-1==0){
                answer[i] = arr[e-1];
            }else{
                answer[i] = arr[e-1]-arr[s-2];    
            }
            
        }
        for(int i=0;i<M;i++){
            System.out.println(answer[i]);
        }
    }
}
