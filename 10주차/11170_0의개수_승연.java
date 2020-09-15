import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t=0;t<T;t++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int cnt =0;
            for(int i=s;i<=e;i++){
                String str = Integer.toString(i);
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='0'){
                        cnt++;
                    }
                }
            }
            answer[t] = cnt;
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
