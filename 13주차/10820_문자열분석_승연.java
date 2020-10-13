import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] answer = new int[101][4];
        int index =0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>=97&&s.charAt(i)<=122){
                    answer[index][0]++;
                }
                else if(s.charAt(i)>=65&&s.charAt(i)<=90){
                    answer[index][1]++;
                }
                else if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9){
                    answer[index][2]++;
                }else if(s.charAt(i)==' '){
                    answer[index][3]++;
                }
            }
            index++;
        }
        for(int i=0;i<index;i++){
            System.out.println(answer[i][0]+" "+answer[i][1]+" "+answer[i][2]+" "+answer[i][3]);
        }
    }
}
