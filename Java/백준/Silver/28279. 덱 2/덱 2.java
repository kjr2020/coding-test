import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> target = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "1":
                    target.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    target.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    if(target.size() == 0){
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(target.removeFirst() + "\n");
                    break;
                case "4":
                    if(target.size() == 0){
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(target.removeLast() + "\n");
                    break;
                case "5":
                    sb.append(target.size() + "\n");
                    break;
                case "6":
                    if(target.size() == 0){
                        sb.append("1\n");
                        break;
                    }
                    sb.append("0\n");
                    break;
                case "7":
                    if(target.size() == 0){
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(target.peekFirst() + "\n");
                    break;
                case "8":
                    if(target.size() == 0){
                        sb.append("-1\n");
                        break;
                    }
                    sb.append(target.peekLast() + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}