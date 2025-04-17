import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		int paper = Integer.parseInt(br.readLine());
		boolean[][] whitePaper = new boolean[100][100];
		
		for(int i = 0 ; i < paper ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    
		    for(int j = x ; j < x + 10 ; j++){
		        for(int k = y ; k < y + 10 ; k++){
		            if(!whitePaper[k][j]) {
		                answer++;
		                whitePaper[k][j] = true;
		            }
		        }
		    }
		}
		System.out.println(answer);
	}
}