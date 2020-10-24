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
        prev_permutation(arr);
    }
    
    public static void prev_permutation(int[] arr){
        boolean flag = false;
        Loop1: for(int i=N-1;i>0;i--){
            if(arr[i-1]>arr[i]){
                for(int j=N-1;j>=i;j--){
                    if(arr[j]<arr[i-1]){
                        int tmp = arr[j];
                        arr[j] = arr[i-1];
                        arr[i-1] = tmp;
                        int k=N-1;
                        while(i<k){
                            int tmp1 = arr[i];
                            arr[i] = arr[k];
                            arr[k] = tmp1;
                            k--;
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
