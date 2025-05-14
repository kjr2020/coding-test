import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		TreeMap<Integer, Integer> B = new TreeMap<>();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
		    A[i] = Integer.parseInt(st1.nextToken());
		    int b = Integer.parseInt(st2.nextToken());
		    B.put(b, B.getOrDefault(b,0) + 1);
		}
		
		for(int i = 0 ; i < N ; i++){
		    Integer selected = B.ceilingKey(A[i]);
		    if(selected == null){
		        sb.setLength(0);
		        sb.append("-1");
		        break;
		    }
		    sb.append(selected).append(" ");
		    B.put(selected, B.get(selected) - 1);
		    if(B.get(selected) == 0){
		        B.remove(selected);
		    }
		}
		System.out.println(sb);
	}
}