import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int hp = 100;
		int[][] arr = new int[N][2];
		
		StringTokenizer hpToken = new StringTokenizer(br.readLine());
		StringTokenizer happyToken = new StringTokenizer(br.readLine());
		    
		for(int i = 0 ; i < N ; i++){
		    arr[i][0] = Integer.parseInt(hpToken.nextToken());
		    arr[i][1] = Integer.parseInt(happyToken.nextToken());
		}
		
		int[] dp = new int[101]; // 체력은 최대 100까지 고려 (하지만 100 이상은 못 씀)
        
        for (int i = 0; i < N; i++) {
            // 뒤에서부터 순회해야 이전 dp값이 덮이지 않음 (0-1 knapsack 핵심)
            for (int j = 100; j >= arr[i][0]; j--) {
                if (j - arr[i][0] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - arr[i][0]] + arr[i][1]);
                }
            }
        }
        
        // 체력 0 ~ 99 중 최대 기쁨 찾기
        int maxJoy = 0;
        for (int i = 0; i < 100; i++) {
            maxJoy = Math.max(maxJoy, dp[i]);
        }
        
        System.out.println(maxJoy);
	}
}