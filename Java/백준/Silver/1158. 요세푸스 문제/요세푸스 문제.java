import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Deque<Integer> arr = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 1 ; i < N + 1 ; i++){
		    arr.addLast(i);
		}
		int cur = 0;
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ; j < K - 1 ; j++){
		        int tmp = arr.removeFirst();
		        arr.offerLast(tmp);
		    }
		    answer.add(arr.removeFirst());
		}
		sb.append("<");
		while(!answer.isEmpty()){
		    if(answer.size() == 1) {
		        sb.append(answer.remove(0)).append(">");
		        break;
		    }
		    sb.append(answer.remove(0)).append(", ");
		}
		System.out.println(sb);
	}
}