import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(true){
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            if(L==0&&P==0&&V==0) return;
            int div = V/P;
            int rest = V%P;
            if(rest>L) rest = L;
            div = div*L;
            System.out.println("Case "+count+": "+(div+rest));
            count++;
        }
    }
}
