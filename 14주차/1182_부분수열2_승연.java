import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(arr[i]==K) count++;
            list.add(arr[i]);
            int size = list.size();
            for(int j=0;j<size-1;j++){
                if(arr[i]+list.get(j)==K){
                    count++;
                }
                list.add(arr[i]+list.get(j));
            }
        }
        System.out.println(count);
    }
}
