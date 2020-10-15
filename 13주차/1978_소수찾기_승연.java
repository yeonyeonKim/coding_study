import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[101];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<N;i++){
            int num = arr[i];
            if(num==1) continue;
            boolean flag = false;
            for(int j =2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
