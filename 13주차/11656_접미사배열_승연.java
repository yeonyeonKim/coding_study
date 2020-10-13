import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = new String[s.length()];
        for(int i=0;i<s.length();i++){
            String str ="";
            for(int j=i;j<s.length();j++){
                str+=s.charAt(j);
            }
            arr[i] = str;
        }
        Arrays.sort(arr);
        for(int i=0;i<s.length();i++){
            System.out.println(arr[i]);
        }
    }
}
