import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        double[] visited = new double[10001];
        for(int i=0;i<N;i++){
            int num = arr[i];
            if(visited[num]==0){
                count++;
                for(int j=num;j<num+L;j++){
                    visited[j]=1;
                }
            }
        }
        
        System.out.println(count);
    }
}
