import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++){
            StringBuilder sb = new StringBuilder();
            HashSet<String> animalSound = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(true){
                String[] animalSplit = br.readLine().split(" ");
                if(animalSplit.length == 5) break;
                animalSound.add(animalSplit[2]);
            }
            while(st.hasMoreTokens()){
                String target = st.nextToken();
                if(animalSound.contains(target)) continue;
                sb.append(target).append(" ");
            }
            
            System.out.println(sb);
        }
    }
}