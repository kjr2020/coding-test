import java.io.*;
import java.util.*;

public class Main{
    
    public static Deque<Integer> targetQueue;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        targetQueue = new LinkedList<>();
        
        
        for(int i = 0 ; i < N ; i++){
            int result = queueBehavior(br.readLine());
            if(result != -99) System.out.println(result);
        }
    }
    
    static int queueBehavior(String order){
        StringTokenizer st = new StringTokenizer(order);
        
        switch(st.nextToken()){
            case "push":
                targetQueue.offerLast(Integer.parseInt(st.nextToken()));
                break;
            case "pop":
                try{
                    return targetQueue.removeFirst();
                } catch (Exception e){
                    return -1;
                }
            case "size":
                return targetQueue.size();
            case "empty":
                if(targetQueue.isEmpty()) return 1;
                return 0;
            case "front":
                try{
                    return targetQueue.peekFirst();
                } catch (Exception e){
                    return -1;
                }
            case "back":
                try{
                    return targetQueue.peekLast();
                } catch (Exception e){
                    return -1;
                }
        }
        
        return -99;
    }
}