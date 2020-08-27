import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        int i=N-1;
        while(i>=0){
            int div = K/arr[i];
            int rest = K%arr[i];
            count+=div;
            i--;
            K = rest;
        }
        System.out.println(count);
    }
}
