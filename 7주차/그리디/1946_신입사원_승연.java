import java.util.*;
class Main{
    static class Score implements Comparable<Score>{
        int x;
        int y;
        Score(int x,int y){
            this.x = x;
            this.y = y;
        }
        public int compareTo(Score s){
            if(this.x>s.x){
                return 1;
            }else if(this.x<s.x){
                return -1;
            }else{
                if(this.y>s.y){
                    return 1;
                }else if(this.y<s.y){
                    return -1;
                }
            }
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t=0;t<T;t++){
            int N =sc.nextInt();
            Score[] score = new Score[N];
            for(int i=0;i<N;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                score[i] = new Score(x,y);
            }
            int count=0;
            Arrays.sort(score);
            int tmp = score[0].y;
            count++;
            for(int i=1;i<N;i++){
                if(tmp>score[i].y){
                    tmp = score[i].y;
                    count++;
                }
            }
            answer[t] = count;
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
