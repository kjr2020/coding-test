import java.io.*;
import java.util.*;
public class Main
{
    static boolean[][] savage;
    static int X;
    static int Y;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int j = 0 ; j < T ; j++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    X = Integer.parseInt(st.nextToken());
		    Y = Integer.parseInt(st.nextToken());
		    int K = Integer.parseInt(st.nextToken());
		    savage = new boolean[Y][X];
		    int count = 0;
		    for(int i = 0 ; i < K ; i++){
		        st = new StringTokenizer(br.readLine());
		        int savageX = Integer.parseInt(st.nextToken());
		        int savageY = Integer.parseInt(st.nextToken());
		        savage[savageY][savageX] = true;
		    }
		    
		    for(int k = 0 ; k < Y ; k++){
		        for(int l = 0; l < X ; l++){
		            if(savage[k][l]){
		                count++;
		                isSavage(k, l);
		            }
		        }
		    }
		    
		    sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
	
	static void isSavage(int y, int x){
	    if(y < 0 || x < 0 || y >= Y || x >= X || !savage[y][x]) return;
	    savage[y][x] = false;
	    isSavage(y+1,x);
	    isSavage(y,x+1);
        isSavage(y-1, x);
        isSavage(y, x-1);
	}
}