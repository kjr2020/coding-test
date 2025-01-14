import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> answer = new HashMap<>();
        
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            
            if(status.equals("enter")){
                answer.put(name, 1);
            }
            
            if(status.equals("leave") && answer.containsKey(name)){
                answer.remove(name);
            }
        }
        
        List<String> sortedAnswer = new ArrayList<>(answer.keySet());
        sortedAnswer.sort(Collections.reverseOrder());
        
        for(String output : sortedAnswer){
            System.out.println(output);
        }
    }
}