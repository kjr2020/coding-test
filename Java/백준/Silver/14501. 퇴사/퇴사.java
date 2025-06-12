/*
현재 배열의 값이 겹치지 않고 들어갈 수 있는지를 확인하기 위해
앞에서 구해놨던 값들과 모두 비교해야함. O(n^2)
만약 날짜를 벗어난다면 반복문을 실행하지 않고,
날짜를 벗어나지 않는다면 이전값들과 비교해서 가장 큰 값을 채용
즉 dp 배열에는 n번째 값이 마지막으로 선택되었을때 가장 큰 값이 들어가 있음
*/

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][2];
		int[] dp = new int[n+1];
		
		for(int i = 1 ; i < n + 1 ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    arr[i][0] = Integer.parseInt(st.nextToken());
		    arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		if(arr[1][0] > n) dp[1] = 0;
		else dp[1] = arr[1][1];
		
		for(int i = 2 ; i < n + 1 ; i++){
		    if(arr[i][0] + i - 1 > n) {
		        dp[i] = 0;
		        continue;
		    }
		    
		    int max = 0;
		    for(int j = i - 1 ; j > 0 ; j--){
		        if(arr[j][0] + j - 1 < i ) {
		            max = Math.max(max, dp[j] + arr[i][1]);
		        } else {
		            max = Math.max(max, arr[i][1]);
		        }
		    }
		    dp[i] = max;
		}
		int answer = 0;
		for(int i = 0 ; i < n + 1 ; i++){
		    answer = Math.max(answer, dp[i]);
		}
		System.out.println(answer);
	}
}