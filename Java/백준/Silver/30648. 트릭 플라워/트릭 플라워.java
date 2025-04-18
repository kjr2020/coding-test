import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(br.readLine());
		Map<Integer, Integer> isFlowered = new HashMap<>();

        isFlowered.put(A,B);

		while(true){
		    if(A+1 + B+1 < R){
		        A++;
		        B++;
		        
		    } else {
		        A /= 2;
		        B /= 2;
		    }
		    answer++;
		    if(isFlowered.containsKey(A)) {
		        if(isFlowered.get(A) == B) break;
		    }
		    isFlowered.put(A,B);
		}
		
		System.out.println(answer);
	}
}