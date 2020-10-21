import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if(N<M||N<K){
            System.out.println("-1");
        }else{
            int count =0;
            int Kim = M;
            int Im = K;
            while(Kim!=Im){
                Kim = (Kim+1)/2;
                Im = (Im+1)/2;
                count++;
            }
            System.out.println(count);
        }
    }
}
