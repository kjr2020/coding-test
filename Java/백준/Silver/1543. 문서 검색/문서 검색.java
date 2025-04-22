import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String dic = br.readLine();
		int answer = 0;
		
		for(int i = 0 ; i < target.length() ; i++){
		    if(dic.charAt(0) == target.charAt(i)){
		        for(int j = 0 ; j < dic.length() ; j++){
		            if(i+j >= target.length()) break;
		            if(dic.charAt(j) != target.charAt(i + j)) break;
		            if(j == dic.length() - 1 && dic.charAt(j) == target.charAt(i + j)) {
		                i += j;
		                answer++;
		            }
		        }
		    }
		}
		System.out.println(answer);
	}
}