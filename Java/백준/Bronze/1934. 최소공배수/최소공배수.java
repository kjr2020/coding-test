import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        //int result = 1;
        
        for(int i = 0 ; i < T ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            // int small = first < second ? first : second;
            // for(int j = 1 ; j <= small ; j++){
            //     if(first%j == 0 && second%j == 0){
            //         result *= j;
            //         small /= j;
            //         first /= j;
            //         second /= j;
            //     }
            // }
            // result = result * first * second;
            // sb.append(Integer.toString(result) + "\n");
            // result = 1;
            int gcd = getGCD(first, second);
            int result = (first * second)/gcd;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    private static int getGCD(int a, int b){
        while(b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}