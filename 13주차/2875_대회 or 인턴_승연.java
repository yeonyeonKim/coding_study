import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int count=0;
        while((N-2)+(M-1)>=K){
            N = N-2;
            M = M-1;
              count++;
            if(N<2||M<1){
                break;
            }
          
        }
        System.out.println(count);
    }
}
