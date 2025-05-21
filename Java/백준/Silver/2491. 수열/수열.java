import java.util.*;
import java.io.*;

public class Main
{
    static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxUp = 1;
		int maxDown = 1;
		int tmpUp = 1;
		int tmpDown = 1;
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++){
		    arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1 ; i < n ; i++){
		    if(arr[i] == arr[i-1]){
		        tmpUp++;
		        tmpDown++;
		    } else if(arr[i] > arr[i-1]){
		        tmpUp++;
		        maxDown = Math.max(maxDown, tmpDown);
		        tmpDown = 1;
		    } else {
		        tmpDown++;
		        maxUp = Math.max(maxUp, tmpUp);
		        tmpUp = 1;
		    }
		}
		maxUp = Math.max(maxUp, tmpUp);
        maxDown = Math.max(maxDown, tmpDown);
		
		System.out.println(Math.max(maxUp, maxDown));
	}
}