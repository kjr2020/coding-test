import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long first = Long.parseLong(st.nextToken());
        long second = Long.parseLong(st.nextToken());
        long gcd = gcd(first, second);
        long result = first * second / gcd;
        System.out.println(result);
    }
    
    private static long gcd(long a, long b){
        while(b != 0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}