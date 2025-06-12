/*
동전의 개수에 제한이 없기 때문에 큰거부터 나눠보면서 0원이 될때까지 진행
*/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int[] coins = new int[n];
		
		for(int i = 0 ; i < n ; i++){
		    coins[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		for(int i = n - 1 ; i >= 0 ; i--){
		    answer += target/coins[i];
		    target %= coins[i];
		    if(target == 0) break;
		}
		
		
		System.out.println(answer);
	}
}