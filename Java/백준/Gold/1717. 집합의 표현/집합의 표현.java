import java.util.*;
import java.io.*;

// for(int i = 0 ; i < m ; i++){
// 		    st = new StringTokenizer(br.readLine());
// 		    int flag = Integer.parseInt(st.nextToken());
// 		    int a = Integer.parseInt(st.nextToken());
// 		    int b = Integer.parseInt(st.nextToken());
// 		    if(flag == 1){
// 		        for(int j = 0 ; j < arr.size() ; j++){
// 		            if(arr.get(j).contains(a) && arr.get(j).contains(b)){
// 		                System.out.println("YES");
// 		                return;
// 		            }
// 		        }
// 		        System.out.println("NO");
// 		    }else {
// 		        int isContainA = -1;
// 		        int isContainB = -1;
// 		        for(int j = 0 ; j < arr.size() ; j++){
// 		            if(arr.get(j).contains(a)) isContainA = j;
// 		            if(arr.get(j).contains(b)) isContainB = j;
// 		        }
// 		        if(isContainA == isContainB && isContainA != -1) continue;
// 		        if(isContainA == -1 && isContainB == -1){
// 		            arr.add(new HashSet<Integer>(Arrays.asList(a,b)));
// 		        } else if(isContainA > -1 && isContainB > -1){
// 		            arr.get(isContainA).addAll(arr.get(isContainB));
// 		            arr.remove(isContainB);
// 		        } else{
// 		            int big = isContainA > isContainB ? isContainA : isContainB;
// 		            int small = big == isContainA ? b : a;
// 		            arr.get(big).add(small);
// 		        }
// 		    }
// 		}

public class Main
{
    static int[] parent;
    static int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<HashSet<Integer>> arr = new ArrayList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n+1];
		for(int i = 0 ; i < n+1 ; i++){
		    parent[i] = i;
		}
		for(int i = 0 ; i < m ; i++){
		    st = new StringTokenizer(br.readLine());
		    int flag = Integer.parseInt(st.nextToken());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    if(flag == 1){
		        if(find(a) == find(b)){
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }
		    }else {
		        union(a, b);
		    }
		}
	}
}