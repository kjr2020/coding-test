import java.io.*;
import java.util.*;

public class Main{
    public static int[] stairs;
    public static int answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> pokemons = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1 ; i < N+1 ; i++){
            String name = br.readLine();
            pokemons.put(i, name);
            reverseMap.put(name, i);
        }
        
        for(int i = 0 ; i < M ; i++){
            String target = br.readLine();
            if(target.matches("-?\\d+")) sb.append(pokemons.get(Integer.parseInt(target)) + "\n");
            else sb.append(reverseMap.get(target) + "\n");
        }
        
        System.out.println(sb);
    }
}