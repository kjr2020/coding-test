import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] papers = new int[N];
        int[] answer = new int[N];
        int cursor = 0;
        int target = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            papers[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0 ; i < N ; i++){
            answer[i] = cursor + 1;
            target = papers[cursor];
            papers[cursor] = 0;
            if(i == N -1 ) break;
            if(target < 0){
                for(int j = 0 ; j > target ; j-- ){
                    cursor--;
                    if(cursor < 0){
                        cursor = N - 1;
                    }
                    if(papers[cursor] == 0) j++;
                }
            } else {
                for(int j = 0 ; j < target ; j++){
                    cursor++;
                    if(cursor == N){
                        cursor = 0;
                    }
                    if(papers[cursor] == 0) j--;
                }
            }
        }
        for(int i = 0 ; i < N ; i++){
            System.out.printf(answer[i] + " ");
        }
        
    }
}