import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int answer1 = (A+B)%C;
        int answer2 = ((A%C)+(B%C))%C;
        int answer3 = (A*B)%C;
        int answer4 = ((A%C)*(B%C))%C;
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }
}
