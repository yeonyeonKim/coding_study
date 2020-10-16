import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] answer = new int[T][2];
        int[] list = new int[10001];
        for(int i=2;i<10001;i++){
                boolean flag = false;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    list[i] = 1;
                }else{
                  list[i] =0;
                }
         }
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=1;i<N;i++){
                if(list[i]==1&&list[N-i]==1){
                    if(min>Math.abs(i-(N-i))){
                        answer[t][0]=i;
                        answer[t][1]=N-i;
                        min = Math.abs(i-(N-i));
                    }
                }
            }
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i][0]+" "+answer[i][1]);
        }
    }
}
