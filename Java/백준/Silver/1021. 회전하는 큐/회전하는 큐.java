import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int answer = 0;
		Deque<Integer> myQueue = new LinkedList<>();
		for(int i = 1 ; i < N + 1 ; i++){
		    myQueue.offer(i);
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ; i++){
		    int target = Integer.parseInt(st.nextToken());
		    for(int j = 0 ; j < myQueue.size() ;j++){
		        if(myQueue.peekFirst() == target){
		            if(myQueue.size()/2 < j){
		                answer += myQueue.size() - j;
		            } else{
		                answer += j;
		            }
		            myQueue.removeFirst();
		            break;
		        }
		        myQueue.offerLast(myQueue.removeFirst());
		    }
		}
		System.out.println(answer);
	}
}