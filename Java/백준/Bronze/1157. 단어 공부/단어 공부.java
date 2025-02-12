import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		target = target.toUpperCase();
		char answer = '?';
		int count = 0;
		HashMap<Character, Integer> findMax = new HashMap<>();
		for(int i = 0 ; i < target.length() ; i++){
		    char current = target.charAt(i);
		    findMax.put(current, findMax.getOrDefault(current, 0) + 1);
		    if(findMax.get(current) > count) {
		        answer = current;
		        count = findMax.get(current);
		    }
		    else if(findMax.get(current) == count ){
		        answer = '?';
		    }
		}
		
		System.out.println(answer);
	}
}