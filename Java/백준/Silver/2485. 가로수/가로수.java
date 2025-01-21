import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] space = new int[N-1];
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(i != 0){
                space[i-1] = arr[i] - arr[i-1];
            }
        }
        int end = arr[N-1];
        int gcd = gcd(space[0], space[1]);
        for(int i = 2 ; i < N-1 ; i++){
            gcd = gcd(gcd, space[2]);
        }
        int result = ((end-arr[0])/gcd) - N + 1;
        sb.append(result);
        System.out.println(sb);
    }
    
    private static int gcd(int a, int b){
        while(b != 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}