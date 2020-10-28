import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=97&&ch<=122){
                ch =(char)((ch)-32);
            }
            if(!hash.containsKey(ch)){
                hash.put(ch,1);
            }else{
                hash.put(ch,hash.get(ch)+1);
            }
        }
        int tmp =0;
        String answer="";
        for(char i:hash.keySet()){
            if(tmp<=hash.get(i)){
                if(tmp==hash.get(i)){
                    answer = "?";
                }else{
                    tmp = hash.get(i);
                    answer = i+" ";
                }
            }
        }
        System.out.println(answer);
    }
}
