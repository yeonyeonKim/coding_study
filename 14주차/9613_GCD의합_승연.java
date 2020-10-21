import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            long sum=0;
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    sum+=GCD(arr[i],arr[j]);
                }
            }
             System.out.println(sum);
        }
    }
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
