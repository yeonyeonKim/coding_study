import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=1;
        int len=10;
        int sum=0;
        for(int i=1;i<=N;i++){
            if(i==len){
                cnt++;
                len*=10;
            }
            sum+=cnt;
        }
        System.out.println(sum);
    }
}
