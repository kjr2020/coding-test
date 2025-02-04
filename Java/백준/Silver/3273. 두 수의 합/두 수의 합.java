import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine());
		TreeSet<Integer> treeSet = new TreeSet<>();
		int answer = 0;
		for(int i = 0 ; i < N ; i++){
		    int val = Integer.parseInt(st.nextToken());
		    if(val <= target){
		        treeSet.add(val);
		    }
		}
		ArrayList<Integer> arr = new ArrayList<>(treeSet);
		
		int startCur = 0;
		int endCur = arr.size() - 1;
		while(startCur < endCur){
		    if(arr.get(startCur) + arr.get(endCur) == target) {
		        answer++;
		        startCur++;
		        endCur--;
		    } else if(arr.get(startCur) + arr.get(endCur) < target){
		        startCur++;
		    } else {
		        endCur--;
		    }
		}
		
		System.out.println(answer);
	}
}