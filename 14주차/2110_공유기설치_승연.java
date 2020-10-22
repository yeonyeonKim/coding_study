import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 1;
        int ans=0;
        int right = arr[N-1]-arr[0];
        while(left<=right){
            int mid = (left+right)/2;
            int s = arr[0];
            int count=1;
            for(int i=1;i<N;i++){
                int dist = arr[i]-s;
                if(dist>=mid){
                    s = arr[i];
                    count++;
                }
            }
            if(count>=C){
                //넓게 설치
                ans = mid;
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        System.out.println(ans);
    }
}
