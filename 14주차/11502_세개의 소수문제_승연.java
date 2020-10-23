import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<>();
             int[] answer = new int[3];
            for(int i=2;i<1000;i++){
                boolean flag = false;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag = true;
                    }
                }
                if(!flag){
                    list.add(i);
                }
            }
            boolean flag2 = false;
            for(int i=0;i<list.size();i++){
                for(int j=0;j<list.size();j++){
                    for(int k=0;k<list.size();k++){
                        if(list.get(i)+list.get(j)+list.get(k)==N){
                            flag2 = true;
                            answer[0] =list.get(i);
                            answer[1] =list.get(j);
                            answer[2] =list.get(k);
                            break;
                        }
                    }
                }
            }
            if(!flag2){
                System.out.println("0");
            }else{
                Arrays.sort(answer);
                System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
                
            }
        }
    }
}
