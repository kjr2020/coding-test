import java.io.*;
import java.util.*;

class Main{
    static int[] target;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] targetString = br.readLine().toCharArray();
        Queue<Character> subString = new LinkedList<>();
        target = new int[4];
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i = 0 ; i < 4 ; i++){
            target[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0 ; i < P ; i++){
            subString.offer(targetString[i]);
            minusTarget(targetString[i]);
        }
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            if(target[i] <= 0) count++;
            if(count == 4) answer++;
        }
        
        for(int i = 1 ; i+P <= S ; i++){
            char added = targetString[i+P-1];
            subString.offer(added);
            char removed = subString.poll();
            addTarget(removed);
            minusTarget(added);
            answer += isInclude();
        }
        
        System.out.println(answer);
        
    }
    
    static int isInclude(){
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            if(target[i] <= 0) count++;
        }
        if(count == 4) return 1;
        return 0;
    }
    
    static void addTarget(char current){
        switch(current){
                case ('A'):
                    target[0]++;
                    break;
                case ('C'):
                    target[1]++;
                    break;
                case ('G'):
                    target[2]++;
                    break;
                case ('T'):
                    target[3]++;
                    break;
        }
    }
    
    static void minusTarget(char current){
        switch(current){
                case ('A'):
                    target[0]--;
                    break;
                case ('C'):
                    target[1]--;
                    break;
                case ('G'):
                    target[2]--;
                    break;
                case ('T'):
                    target[3]--;
                    break;
        }
    }
}