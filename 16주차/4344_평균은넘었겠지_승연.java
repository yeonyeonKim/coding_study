import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double[] answer = new double[T];
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            double[] arr = new double[N];
            int sum =0;
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            double avg = sum/N;
            int count=0;
            for(int i=0;i<N;i++){
                if(avg<arr[i]){
                    count++;
                }
            }
            answer[t] = (double)((double)(count)/(double)N)*100;
        }
        for(int i=0;i<T;i++){
            System.out.println(String.format("%.3f",answer[i])+"%");
        }
    }
}
