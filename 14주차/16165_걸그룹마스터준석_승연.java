import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hash = new HashMap<>();
        HashMap<String, ArrayList<String>> group = new HashMap<>();
        for(int i=0;i<N;i++){
            String g = sc.next();
            int K = sc.nextInt();
            group.put(g,new ArrayList<String>());
            for(int j=0;j<K;j++){
                String name = sc.next();
                hash.put(name,g);
                group.get(g).add(name);
            }
            Collections.sort(group.get(g));
        }
        for(int i=0;i<M;i++){
            String str = sc.next();
            int num =sc.nextInt();
            if(num==1){
               sb.append(hash.get(str)+'\n');
            }else{
                int size = group.get(str).size();
                for(int j=0;j<size;j++){
                    sb.append(group.get(str).get(j)+'\n');
                }
            }
        }
        System.out.println(sb.toString());
    }
}
