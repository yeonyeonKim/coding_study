import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        
        for(long i = N; i>N-M;i--){
            a = a.multiply(new BigInteger(String.valueOf(i)));
        }
        for(long i = 1;i<=M;i++){
            b = b.multiply(new BigInteger(String.valueOf(i)));
        }
        BigInteger answer = a.divide(b);
        System.out.println(answer);
    }
}
