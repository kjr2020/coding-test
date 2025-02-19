import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<Character> arr = new HashSet<>();
		int answer = 0;
		
		for(int i = 0 ; i < N ; i++){
		    String voca = br.readLine();
		    char target = voca.charAt(0);
		    arr.add(target);
		    for(int j = 1 ; j < voca.length() ; j++){
		        if(target != voca.charAt(j)) {
		            if(arr.contains(voca.charAt(j))) {
		                answer--;
		                break;
		            }
		            target = voca.charAt(j);
		            arr.add(voca.charAt(j));
		        }
		    }
		    arr = new HashSet<>();
		    answer++;
		}
		
		System.out.println(answer);
	}
}