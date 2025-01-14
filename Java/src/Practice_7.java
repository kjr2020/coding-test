import java.util.*;
import java.io.*;

public class Practice_7 {

    /* 백준 - 블랙잭(2798)*/
    public static void main(String args[]) throws Exception {

        // reader.readLine()
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int[] numArr = new int[N];
        int answer = 0;

        for(int i = 0 ; i < N ; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = i+1 ; j < N ; j++){
                for(int k = j + 1 ; k < N ; k++){
                    int sum = numArr[i] + numArr[j] + numArr[k];
                    if(sum > answer && sum <= M){
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
