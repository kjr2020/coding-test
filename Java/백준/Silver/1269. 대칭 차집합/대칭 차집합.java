import java.io.*;
import java.util.*;


public class Main
{   
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int countA = Integer.parseInt(st.nextToken());
		int countB = Integer.parseInt(st.nextToken());
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < countA ; i++){
		    A.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < countB ; i++){
		    B.add(Integer.parseInt(st.nextToken()));
		}
		
		HashSet<Integer> newA = new HashSet<>(A);
		newA.removeAll(B);
		HashSet<Integer> newB = new HashSet<>(B);
		newB.removeAll(A);
		
		newA.addAll(newB);
		
		System.out.println(newA.size());
	}
	
}