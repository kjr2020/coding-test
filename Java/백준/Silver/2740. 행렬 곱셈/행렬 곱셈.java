import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		
		for(int i = 0 ; i < N ; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0 ; j < M; j++){
		        A[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int K = Integer.parseInt(st.nextToken());
		int[][] B = new int[M][K];
		for(int i = 0 ; i < M ; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0 ; j < K; j++){
		        B[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		int[][] answer = new int[N][K];
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ; j < K ;j++){
		        int tmp = 0;
		        for(int k = 0 ; k < M ; k++){
		            tmp += A[i][k] * B[k][j];
		        }
		        answer[i][j] = tmp;
		        sb.append(tmp).append(" ");
		    }
		    sb.append("\n");
		}
		
		System.out.println(sb);
	}
}