import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(stack.size()!=0&&stack.peek()=='('&&ch==')'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        System.out.println(stack.size());
    }
}
