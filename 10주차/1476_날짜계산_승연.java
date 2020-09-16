import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int answer = 1;
        while(true){
            if((answer-E)%15==0&&(answer-S)%28==0&&(answer-M)%19==0){
                System.out.println(answer);
                return;
            }
            answer++;
        }
    }
}
