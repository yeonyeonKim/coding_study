import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] arr = new long[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long min = 0;
        long max = arr[N-1];
        long  mid = 0;
        long answer=0;
        while(min<=max){
            long tmp=0;
            mid = (min+max)/2;
            for(int i=0;i<N;i++){
                if(arr[i]>mid){
                    tmp+=arr[i]-mid;
                }
            }
            if(tmp>=M){
                if(answer<mid){
                    answer=mid;
                }
                min=mid+1;
            }else{
                max = mid-1;
            }
        }
        System.out.println(answer);
    }
}
