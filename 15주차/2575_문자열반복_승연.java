import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] answer = new String[T];
        Arrays.fill(answer,"");
        for(int t =0;t<T;t++){
            int N =sc.nextInt();
            String str = sc.next();
            for(int i=0;i<str.length();i++){
                for(int j=0;j<N;j++){
                    answer[t]+=str.charAt(i);
                }
            }
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
