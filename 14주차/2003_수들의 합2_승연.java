import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<N;i++){
            int sum =0;
            for(int j=i;j<N;j++){
                sum +=arr[j];
                if(sum ==M){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
