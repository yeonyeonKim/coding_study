import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hash  = new HashMap<>();
        hash.put('a',0); hash.put('f',0);
        hash.put('g',0); hash.put('b',0);
        hash.put('h',0); hash.put('c',0);
        hash.put('i',0);hash.put('d',0);
        hash.put('j',0);hash.put('e',0);
        hash.put('k',0);hash.put('s',0);
        hash.put('l',0);hash.put('z',0);
        hash.put('m',0);hash.put('y',0);
        hash.put('n',0);hash.put('x',0);
        hash.put('o',0);hash.put('w',0);
        hash.put('p',0);hash.put('v',0);
        hash.put('q',0);hash.put('u',0);
        hash.put('r',0);hash.put('t',0);
        
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }
        }
        Iterator<Character> it = hash.keySet().iterator();
        while(it.hasNext()){
            char key = it.next();
            System.out.print(hash.get(key)+" ");
        }
    }
}
