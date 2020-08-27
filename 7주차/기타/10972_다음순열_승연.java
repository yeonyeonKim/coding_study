import java.util.*;
class Main{
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        next_permutation(arr);
    }
    public static void next_permutation(int[] arr){
        boolean flag = false;
        Loop1: for(int i=N-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                for(int j=N-1;j>=i;j--){
                    if(arr[j]>arr[i-1]){
                        int tmp = arr[i-1];
                        arr[i-1] = arr[j];
                        arr[j] = tmp;
                        int K = N-1;
                        while(K>i){
                            int tmp1 = arr[i];
                            arr[i] = arr[K];
                            arr[K] = tmp1;
                            K--;
                            i++;
                        }
                        flag = true;
                        break Loop1;
                    }
                }
            }
        }
        if(flag){
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println("-1");
        }
    }
}
