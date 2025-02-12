import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		Stack<Integer> target = new Stack<>();
		for(int i = 0 ; i < N ; i++){
		    int val = Integer.parseInt(br.readLine());
		    if(val == 0){
		        target.pop();
		        continue;
		    }
		    target.push(val);
		}
		for(int add : target){
		    answer += add;
		}
		
		System.out.println(answer);
	}
}