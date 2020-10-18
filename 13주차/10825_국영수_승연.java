import java.util.*;
class Main{
    static class Point implements Comparable<Point>{
        String name;
        int K;
        int E;
        int M;
        Point(String name, int K,int E,int M){
            this.name = name;
            this.K = K;
            this.E = E;
            this.M = M;
        }
        public int compareTo(Point p){
            if(this.K>p.K){
                return -1;
            }else if(this.K==p.K){
                if(this.E>p.E){
                    return 1;
                }else if(this.E==p.E){
                    if(this.M>p.M){
                        return -1;
                    }else if(this.M==p.M){
                        return name.compareTo(p.name);
                    }else{
                        return 1;
                    }
                }else{
                    return -1;    
                }
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] point = new Point[N];
        for(int i=0;i<N;i++){
            String name = sc.next();
            int k=sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();
            point[i] = new Point(name,k,e,m);
        }
         Arrays.sort(point);
        for(int i=0;i<N;i++){
            System.out.println(point[i].name);
        }
    }
}
