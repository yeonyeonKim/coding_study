import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int one = 0;
        int zero = 0;
        if(str.charAt(0)=='1') one++;
        else zero++;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                if(str.charAt(i+1)=='1'){
                    one++;
                }else zero++;
            }
        }
        System.out.println(Math.min(one,zero));
    }
}
