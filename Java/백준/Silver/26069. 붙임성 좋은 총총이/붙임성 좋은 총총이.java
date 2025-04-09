import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> isRainbowed = new HashSet<>();
		isRainbowed.add("ChongChong");
		StringTokenizer st;
		for(int i = 0 ; i < N ; i++){
		    st = new StringTokenizer(br.readLine());
		    String first = st.nextToken();
		    String second = st.nextToken();
		    if(isRainbowed.contains(first)){
		        isRainbowed.add(second);
		        continue;
		    }
		    if(isRainbowed.contains(second)){
		        isRainbowed.add(first);
		        continue;
		    }
		}
		System.out.println(isRainbowed.size());
	}
}