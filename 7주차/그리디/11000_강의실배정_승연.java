import java.util.*;
class Main{
    static class Room implements Comparable<Room>{
        int start;
        int end;
        Room(int start,int end){
            this.start = start;
            this.end = end;
        }
        public int compareTo(Room r){
            if(this.start>r.start){
                return 1;
            }else if(this.start==r.start){
                if(this.end>r.end){
                    return 1;
                }else if(this.end<r.end){
                    return -1;
                }
            }else{
                return -1;
            }
            return 0;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Room[] room = new Room[N];
        for(int i=0;i<N;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            room[i] = new Room(s,e);
        }
        Arrays.sort(room);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int end = room[i].end;
            if(!q.isEmpty()&&q.peek()<=room[i].start){
                q.remove();
            }
            q.offer(end);
        }
        System.out.println(q.size());
    }
}
