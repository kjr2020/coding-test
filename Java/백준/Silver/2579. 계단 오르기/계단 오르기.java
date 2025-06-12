/*
점화식을 잘 세워보자.
한 칸 뛰어오거나, 바로 전 칸에서 온값에 지금 값을 더하는 것만 가능하다.
패인: 조건은 생각했지만, dp[i-3] + stairs[i-1] + stairs[i] 이걸 도출 못함
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] stairs = new int[n];
		int[] dp = new int[n];
		
		for(int i = 0 ; i < n ; i++){
		    stairs[i] = Integer.parseInt(br.readLine());
		}
		
		if(n == 1) System.out.println(stairs[0]);
		else if(n == 2) System.out.println(stairs[0] + stairs[1]);
		else {
    		int answer = 0;
	    	dp[0] = stairs[0];
		    dp[1] = stairs[0] + stairs[1];
		    dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
		
    		for(int i = 3 ; i < n ; i++){
    		    dp[i] = Math.max(dp[i-3] + stairs[i-1] + stairs[i], dp[i-2] + stairs[i]);
     		}
    
    		System.out.println(dp[n-1]);
		}
	}
}