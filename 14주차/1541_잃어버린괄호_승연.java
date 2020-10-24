import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()+2];
        arr = str.toCharArray();
        
        boolean flag = false;
        int sum =0;
        String tmp="";
        for(int i=0;i<str.length();i++){
            if(arr[i]=='-'||arr[i]=='+'){
                if(flag){
                    sum -= Integer.parseInt(tmp);
                }else{
                    sum +=Integer.parseInt(tmp);
                }
                tmp="";
                if(arr[i]=='-'){
                    flag = true;
                }
            }
            else{
                tmp+=arr[i];
            }
        }
        if(flag){
          sum-=Integer.parseInt(tmp);
        }else{
          sum+=Integer.parseInt(tmp);
        }
        System.out.println(sum);
    }
}
