import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            HashMap<String, Integer> hash = new HashMap<>();
            for(int i=0;i<N;i++){
                String name = sc.next();
                String pur = sc.next();
                if(hash.containsKey(pur)){
                    hash.put(pur,hash.get(pur)+1);
                }else{
                    hash.put(pur,1);
                }
            }
            int count=1;
            for(int i:hash.values()){
                count*=(i+1);
            }
            answer[t] = count-1;
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
}
