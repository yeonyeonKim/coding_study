import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for(int i =1;i<=9;i++){
            int num = sc.nextInt();
            if(max<num){
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
