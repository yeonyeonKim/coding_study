import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int left = 0;
        int right =0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            right+=arr[i];
            left = Math.max(left,arr[i]);
        }
        while(left<=right){
            int count=0;
            int tmp_sum = 0;//가진 돈
            int mid  = (left+right)/2;
            for(int i=0;i<N;i++){
                if(tmp_sum+arr[i]>mid){
                    count++;
                    tmp_sum =0;
                }
                tmp_sum+= arr[i];
            }
            if(tmp_sum!=0) count++;
            if(count>M){
                left = mid+1;
                
            }else{
                right = mid-1;
            }
        }
        System.out.println(left);
    }
}
