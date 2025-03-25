import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fiveKg = 0;
        int answer = 0;
        
        fiveKg = N/5;
        N %= 5;
        for(int i = fiveKg ; i >= 0 ; i--){
            if(N % 3 == 0){
                answer = fiveKg + (N/3);
                System.out.println(answer);
                return;
            }
            if(i == 0) {
                System.out.println("-1");
                return;
            }
            fiveKg--;
            N += 5;
        }
    }
}