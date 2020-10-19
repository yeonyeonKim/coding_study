import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[51][51];
        for(int i=0;i<N;i++){
            String str = sc.next();
            for(int j=0;j<N;j++){
                char ch = str.charAt(j);
                if(i==j) arr[i][j]=0;
                else{
                    if(ch=='Y'){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=987654321;
                    }
                }  
            }
        }
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(i==j||j==k||i==k) continue;
                    if(arr[i][k]+arr[k][j]<arr[i][j]){
                        arr[i][j] = arr[i][k]+arr[k][j];
                    }
                }
            }
        }
        int max =0;
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(arr[i][j]<=2){
                    count++;
                }
            }
            max = Math.max(max, count);
        }
      System.out.println(max); 
    }
}
