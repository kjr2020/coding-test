import java.util.*;
import java.io.*;

public class Main
{
    static char[][] campus;
    static int answer;
    static boolean[][] isPassed;
    static int N;
    static int M;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int startX = 0;
		int startY = 0;
		campus = new char[N][M];
		isPassed = new boolean[N][M];
		answer = 0;
		
		for(int i = 0 ; i < N ; i++){
		    String tmp = br.readLine();
		    for(int j = 0 ; j < M ;j++){
		        if(tmp.charAt(j) == 'I'){
		            campus[i][j] = 'O';
		            startX=i;
		            startY=j;
		        }
		        else{
		            campus[i][j] = tmp.charAt(j);
		        }
		    }
		}
		go(startX, startY);
	
		System.out.println(answer == 0 ? "TT" : answer);
	}
	
	public static void go(int x, int y){
	    if(campus[x][y] == 'X' || isPassed[x][y]) return;
	    isPassed[x][y] = true;
	    if(campus[x][y] == 'P') answer++;
	    
	    if(x-1 > -1) go(x-1, y);
	    if(x+1 < N) go(x+1, y);
	    if(y-1 > -1) go(x, y-1);
	    if(y+1 < M) go(x,y+1);
	}
}