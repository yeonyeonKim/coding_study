import java.util.*;
class Main{
    static char[][] black = {
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'}
    };
    static char[][] white = {
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'}
    };
    static char[][] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new char[N][M];
        for(int i=0;i<N;i++){
            String str = sc.next();
            for(int j=0;j<M;j++){
                arr[i][j] = str.charAt(j);
            }
        }
        int tmp=0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                tmp = Math.min(black_check(i,j),white_check(i,j));
                if(tmp<ans){
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }
    public static int black_check(int x,int y){
        int cnt=0;
        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(black[i-x][j-y]!=arr[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static int white_check(int x,int y){
        int cnt=0;
        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(white[i-x][j-y]!=arr[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
