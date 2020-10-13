import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] answer = new char[s.length()+1];
        Arrays.fill(answer,' ');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=64&&s.charAt(i)<=90){
                if(s.charAt(i)+13>90){
                    answer[i] = (char)(s.charAt(i)+13-26);
                }else{
                    answer[i] = (char)(s.charAt(i)+13);
                }
            }
            else if(s.charAt(i)>=97&&s.charAt(i)<=122){
                if(s.charAt(i)+13>122){
                    answer[i] = (char)(s.charAt(i)+13-26);
                }else{
                    answer[i] = (char)(s.charAt(i)+13);
                }
            }else if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9){
              answer[i] = s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(answer[i]);
        }
    }
}
