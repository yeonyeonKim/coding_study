import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        
        for(long i=M+1;i<=N;i++){
           a= a.multiply(new BigInteger(String.valueOf(i)));
        }
        for(long i=1;i<=N-M;i++){
            b=b.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(a.divide(b));
    }
}
