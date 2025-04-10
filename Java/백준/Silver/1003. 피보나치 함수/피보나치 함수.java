import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] zeroArr = new int[41];
		int[] oneArr = new int[41];
		
		zeroArr[0] = 1;
		zeroArr[1] = 0;
		oneArr[0] = 0;
		oneArr[1] = 1;
		
		for(int i = 2 ; i < zeroArr.length ; i++){
		    zeroArr[i] = zeroArr[i-1] + zeroArr[i-2];
		    oneArr[i] = oneArr[i-1] + oneArr[i-2];
		}
		
		for(int i = 0 ; i < T ; i++){
		    int target = Integer.parseInt(br.readLine());
		    sb.append(zeroArr[target]).append(" ").append(oneArr[target]).append("\n");
		}
		System.out.println(sb);
	}
}