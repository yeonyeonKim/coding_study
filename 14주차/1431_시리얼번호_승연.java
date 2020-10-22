import java.util.*;
class Main{
    static class S implements Comparable<S>{
        int len;
        int sum;
        String name;
        S(int len, int sum, String name){
            this.len = len;
            this.sum = sum;
            this.name = name;
        }
        public int compareTo(S s){
            if(this.len>s.len){
                return 1;
            }else if(this.len==s.len){
                if(this.sum>s.sum){
                    return 1;
                }else if(this.sum==s.sum){
                    return this.name.compareTo(s.name);
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }
   }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        S[] arr = new S[N];
        for(int i=0;i<N;i++){
            String s = sc.next();
            int len =s.length();
            int sum =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)-'0'>=0&&s.charAt(j)-'0'<=9){
                    sum+=s.charAt(j)-'0';
                }
            }
            arr[i] = new S(len, sum, s);
        }
        Arrays.sort(arr);
        
        for(int i=0;i<N;i++){
            System.out.println(arr[i].name);
        }
    }
}
