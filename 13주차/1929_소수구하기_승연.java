import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=M;i<=N;i++){
            boolean flag = false;
            if(i==1) continue;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                list.add(i);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
