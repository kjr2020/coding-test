import java.io.*;
import java.util.*;
public class Main
{
    //완전 제곱수 찾는 문제였다...
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1 ; i*i <= N ; i++){
		    count++;
		}
		
		System.out.println(count);
	}
}