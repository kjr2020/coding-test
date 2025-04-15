import java.util.*;
import java.io.*;

public class Main
{
    static int N;
    static int M;
    static int[][] city;
    static boolean[][] isArrived;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		city = new int[M][N];
		isArrived = new boolean[M][N];
		
		for(int i = 0 ; i < M ; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0 ; j < N ; j++){
		        city[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		goGo(0, 0);
		
		System.out.println(isArrived[M-1][N-1] ? "Yes":"No");
	}
	
	static void goGo(int x, int y){
	    if(isArrived[y][x] || city[y][x] == 0) return;
	    isArrived[y][x] = true;
	    if(y+1 < M) goGo(x, y+1);
	    if(x+1 < N) goGo(x+1, y);
	}
}