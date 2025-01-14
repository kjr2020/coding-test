import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Boolean> notHeard = new HashMap<>();
        int answerNum = 0;
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i = 0 ; i < N ; i++){
            notHeard.put(br.readLine(), true);
        }
        
        for(int i = 0 ; i < M ; i++){
            String target = br.readLine();
            if(notHeard.containsKey(target)){
                answerNum++;
                answer.add(target);
            }
        }
        Collections.sort(answer);
        System.out.println(answerNum);
        for(String an : answer){
            System.out.println(an);
        }
    }
}