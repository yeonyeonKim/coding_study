import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<N;i++){
            int tmp=0;
            String str = Integer.toString(i);
            for(int j=0;j<str.length();j++){
                tmp+=str.charAt(j)-'0';
            }
            tmp+=i;
            if(tmp==N){
                ans = i;
                break;
            }
        }
        if(ans==Integer.MAX_VALUE){
            System.out.println("0");
            return;
        }
        System.out.println(ans);
    }
}
