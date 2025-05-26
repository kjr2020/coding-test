/**
LIS를 구현하는 문제
**/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int isMax = dp[0];
        for(int i = 1 ; i < n ; i++){
            isMax = Math.max(isMax, dp[i]);
        }
        
        System.out.println(isMax);
    }
}