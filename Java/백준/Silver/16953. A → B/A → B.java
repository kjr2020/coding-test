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
		
		while(B > A){
		    if(B%2 == 0){
		        B /= 2;
		    } else if(B%10 == 1){
		        B /= 10;
		    } else{
		        answer = -1;
		        break;
		    }
		    answer++;
		    if(A == B) break;
		}
		
		if(A != B) System.out.println("-1");
		else System.out.println(answer + 1);
	}
}