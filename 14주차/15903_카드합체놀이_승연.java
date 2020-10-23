import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        int M = sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        while(count<M){
            long num1 = arr[0];
            long num2 = arr[1];
            long tmp = num1+num2;
            arr[0] = tmp;
            arr[1] = tmp;
            Arrays.sort(arr);
            count++;
        }
        long sum =0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
