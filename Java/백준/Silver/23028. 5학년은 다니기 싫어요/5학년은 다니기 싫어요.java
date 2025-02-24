import java.io.*;
import java.util.*;


public class Main
{   
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int major = 66;
		int all = 130;
		
		int N = 8 - Integer.parseInt(st.nextToken());
		int A = major - Integer.parseInt(st.nextToken());
		int B = all - Integer.parseInt(st.nextToken());
		
		A = A % 3 > 0 ? (A/3) + 1 : A/3;
		B = B % 3 > 0 ? (B/3) + 1 : B/3;
		
		for(int i = 0 ; i < N ; i++){
		    st = new StringTokenizer(br.readLine());
		    
		    major = Integer.parseInt(st.nextToken());
		    all = Integer.parseInt(st.nextToken());
		    
		    int canMajor = Math.min(6, major);
		    int canClass = Math.min(6-canMajor, all);
		    
		    A -= canMajor;
		    B -= (canClass + canMajor);
		    if(A <= 0 && B <= 0) {
		        System.out.println("Nice");
		        return;
		    }
		        
		    
		}
		
		System.out.println("Nae ga wae");
	}
	
}