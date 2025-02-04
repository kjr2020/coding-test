import java.io.*;
import java.util.*;
public class Main
{
    static TreeSet<Integer>[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N+1];
		arr = new TreeSet[N + 1];
		for(int i = 1 ; i < N+1 ; i++){
		    arr[i] = new TreeSet<Integer>();
		}
		
		for(int i = 0 ; i < M ; i++){
		    st = new StringTokenizer(br.readLine());
		    int s = Integer.parseInt(st.nextToken());
		    int e = Integer.parseInt(st.nextToken());
		    
		    arr[s].add(e);
		    arr[e].add(s);
		}
		DFS(start);
		sb.append("\n");
		visited = new boolean[N+1];
		BFS(start);
		System.out.println(sb);
	}
	
	static void DFS(int v){
	    if(visited[v]){
	        return;
	    }
	    visited[v] = true;
	    sb.append(v).append(" ");
	    for(Integer dep : arr[v]){
	        DFS(dep);
	    }
	}
	
	static void BFS(int v){
	    Queue<Integer> bfsQueue = new LinkedList<>();
	    bfsQueue.offer(v);
	    while(!bfsQueue.isEmpty()){
	        int target = bfsQueue.poll();
	        if(visited[target]) continue;
	        visited[target] = true;
	        sb.append(target).append(" ");
	        for(Integer vs : arr[target]){
	            bfsQueue.offer(vs);
	        }
	    }
	}
}