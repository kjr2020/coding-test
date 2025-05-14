import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++){
		    int N = Integer.parseInt(br.readLine());
		    int[][] applicant = new int[N][2];
		    for(int j = 0 ; j < N ; j++){
		        StringTokenizer st = new StringTokenizer(br.readLine());
		        applicant[j][0] = Integer.parseInt(st.nextToken());
		        applicant[j][1] = Integer.parseInt(st.nextToken());
		    }
		    
		    Arrays.sort(applicant, (a,b) -> a[0] - b[0]);
		    int count = 1;
		    int lowInterview = applicant[0][1];
		    for(int j = 1 ; j < N ; j++){
		        if(applicant[j][1] < lowInterview){
		            lowInterview = applicant[j][1];
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}