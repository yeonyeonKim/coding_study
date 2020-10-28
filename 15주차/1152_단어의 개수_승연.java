import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans++;
            }
        }
        if(str.charAt(0)==' '){
            ans--;
        }
        if(str.charAt(str.length()-1)==' '){
            ans--;
        }
        System.out.println(ans);
    }
}
