// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<String> notHeard = new ArrayList<String>();
        ArrayList<String> notSee = new ArrayList<String>();
        int answerNum = 0;
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i = 0 ; i < N ; i++){
            notHeard.add(br.readLine());
        }
        Collections.sort(notHeard);
        for(int i = 0 ; i < M ; i ++ ){
            notSee.add(br.readLine());
        }
        Collections.sort(notSee);
        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < notSee.size() ; j++){
                if(notHeard.get(i).equals(notSee.get(j))){
                    answer.add(notSee.get(j));
                    notSee = new ArrayList<>(notSee.subList(j+1, notSee.size()));
                    answerNum++;
                    break;
                }
                if(notHeard.get(i).compareTo(notSee.get(j)) < 0) {
                    break;
                }
            }
        }
        
        System.out.println(answerNum);
        for(String an : answer){
            System.out.println(an);
        }
    }
}