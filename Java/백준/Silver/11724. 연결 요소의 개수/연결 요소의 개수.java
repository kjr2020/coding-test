import java.io.*;
import java.util.*;

public class Main
{
    static ArrayList<Integer>[] connected;
    static boolean visited[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		connected = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i = 1 ; i < N+1; i++){
		    connected[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < M ; i++){
		    st = new StringTokenizer(br.readLine());
		    int s = Integer.parseInt(st.nextToken());
		    int e = Integer.parseInt(st.nextToken());
		    
		    connected[s].add(e);
		    connected[e].add(s);
		}
		
		int answer = 0;
		for(int i = 1 ; i < N + 1; i++){
		    if(!visited[i]){
		        answer++;
		        DFS(i);
		    }
		}
		
		System.out.println(answer);
	}
	
	static void DFS(int v){
	    if(visited[v]) return;
	    
	    visited[v] = true;
	    
	    for(int i : connected[v]){
	        if(!visited[i]){
	            DFS(i);
	        }
	    }
	}
}