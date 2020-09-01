import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
          arr[i] = sc.nextInt();
        }
        int answer=0;
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int z = j+1;z<N;z++){
                    if(arr[i]+arr[j]+arr[z]<=M){
                        int tmp = Math.abs((arr[i]+arr[j]+arr[z])-M);
                        if(min>tmp){
                            min = tmp;
                            answer = arr[i]+arr[j]+arr[z];
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
