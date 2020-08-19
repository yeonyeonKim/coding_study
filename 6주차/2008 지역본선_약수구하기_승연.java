import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                list.add(i);
            }
        }
        Collections.sort(list);
        if(list.size()<K){
            System.out.println("0");
        }
        else{
            System.out.println(list.get(K-1));
        }
    }
}
