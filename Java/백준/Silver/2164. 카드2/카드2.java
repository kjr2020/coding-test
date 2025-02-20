import java.io.*;
import java.util.*;


public class Main
{   
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> card = new LinkedList<>();
		
		for(int i = 1 ; i < N+1 ; i++){
		    card.add(i);
		}
		boolean flag = true;
		while(card.size() != 1){
		    if(flag){
		        card.removeFirst();
		    } else{
		        card.addLast(card.removeFirst());
		    }
		    flag = !flag;
		}
		
		System.out.println(card.removeFirst());
	}
	
}