import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[27];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==-1){
                arr[s.charAt(i)-97]=i;
            }
        }
        for(int i=0;i<26;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
