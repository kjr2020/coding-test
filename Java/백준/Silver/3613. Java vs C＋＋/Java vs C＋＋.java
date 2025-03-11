import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        char[] now = null;
        
        String target = br.readLine();
        if(target.contains("__") || target.charAt(0) == '_' || target.charAt(target.length() - 1) == '_') {
            System.out.println("Error!");
            return;
        }
        StringTokenizer st = new StringTokenizer(target, "_");
        if(st.countTokens() > 1){
            int tokenCounts = st.countTokens();
            for(int i = 0 ; i < tokenCounts ; i++){
                now = st.nextToken().toCharArray();
                for(int j = 0 ; j < now.length ; j++){
                    if(Character.isUpperCase(now[j])){
                        System.out.println("Error!");
                        return;
                    }
                }
                if(i!=0) now[0] = Character.toUpperCase(now[0]);
                sb.append(now);
            }
        }else{
            now = target.toCharArray();
            for(int i = 0 ; i < target.length() ; i++){
                if(i == 0 && Character.isUpperCase(now[i])){
                    System.out.println("Error!");
                    return;
                }
                if(Character.isUpperCase(now[i])) sb.append("_");
                sb.append(Character.toLowerCase(now[i]));
            }
        }
        
        System.out.println(sb);
    }
}