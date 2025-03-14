import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<String> target = new Stack<>();
        
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "1":
                    target.push(st.nextToken());
                    break;
                case "2":
                    if(target.isEmpty()){
                        System.out.println("-1");
                        break;
                    }
                    System.out.println(target.pop());
                    break;
                case "3":
                    System.out.println(target.size());
                    break;
                case "4":
                    System.out.println(target.isEmpty() == true ? 1 : 0);
                    break;
                case "5":
                    System.out.println(target.isEmpty() == true ? -1 : target.peek());
                    break;
            }
        }
    }
}