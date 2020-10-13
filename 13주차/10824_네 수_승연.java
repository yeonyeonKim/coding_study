import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String str1 = Integer.toString(A);
        str1 +=Integer.toString(B);
        String str2 = Integer.toString(C);
        str2 +=Integer.toString(D);
        long tmp1 = Long.valueOf(str1);
        long tmp2 = Long.valueOf(str2);
        
        long answer = tmp1+tmp2;
        System.out.println(answer);
    }
}
