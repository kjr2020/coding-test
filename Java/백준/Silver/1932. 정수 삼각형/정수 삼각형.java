import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<List<Integer>> dp = new ArrayList<List<Integer>>();
		for(int i = 0 ; i < n ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    List<Integer> floor = new ArrayList<>();
		    while(st.hasMoreTokens()){
		        floor.add(Integer.parseInt(st.nextToken()));
		    }
		    triangle.add(floor);
		}
		
		dp.add(triangle.get(0));
		
		for(int i = 1 ; i < n ; i++){
		    List<Integer> tmp = triangle.get(i);
		    List<Integer> dpTmp = dp.get(i-1);
		    List<Integer> dpCurrent = new ArrayList<Integer>();
		    for(int j = 0 ; j <= i ; j++){
		        if(j == 0){
		            dpCurrent.add(dpTmp.get(0) + tmp.get(j));
		            continue;
		        }
		        if(j == i){
		            dpCurrent.add(dpTmp.get(i-1) + tmp.get(j));
		            continue;
		        }
		        int max = Math.max(dpTmp.get(j), dpTmp.get(j-1));
		        dpCurrent.add(max + tmp.get(j));
		    }
		    dp.add(dpCurrent);
		}
		int answer = 0;
		for(int tmp : dp.get(n-1)){
		    answer = Math.max(tmp, answer);
		}
		
		System.out.println(answer);
	}
}