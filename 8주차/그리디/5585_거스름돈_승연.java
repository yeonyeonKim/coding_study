import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1000-N;
        int[] money = new int[6];
        money[0]=500;
        money[1]=100;
        money[2]=50;
        money[3]=10;
        money[4]=5;
        money[5]=1;
        int answer=0;
        for(int i=0;i<6;i++){
            int div = M/money[i];
            int rest = M%money[i];
            answer+=div;
            if(rest==0){
                System.out.println(answer);
                return;
            }
            M = rest;
        }
    }
}
