import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       int[] arr = new int[N];
       int[] addArr = new int[N];
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i = 0 ; i < N ; i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }
       
       Arrays.sort(arr);
       
       addArr[0] = arr[0];
       int answer = arr[0];
       
       for(int i = 1 ; i < N ; i++){
           addArr[i] = addArr[i-1] + arr[i];
           answer += addArr[i];
       }
       
       System.out.println(answer);
    }
}