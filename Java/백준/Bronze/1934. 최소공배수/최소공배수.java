import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int result = 1;
        
        for(int i = 0 ; i < T ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int small = first < second ? first : second;
            for(int j = 2 ; j <= small ; j++){
                if(first%j == 0 && second%j == 0){
                    result *= j;
                    small /= j;
                    first /= j;
                    second /= j;
                    j--;
                }
            }
            result = result * first * second;
            sb.append(result + "\n");
            result = 1;
        }
        System.out.println(sb);
    }
}