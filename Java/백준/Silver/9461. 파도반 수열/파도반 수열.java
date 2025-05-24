//점화식: 1번에서 3번까지는 1, 4,5 번은 2로 초기값 설정
//이후부터는 (이전길이 + n-5의 길이)

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] triArr = new long[101];
        triArr[1] = 1;
        triArr[2] = 1;
        triArr[3] = 1;
        triArr[4] = 2;
        triArr[5] = 2;
        for(int i = 6 ; i < 101 ; i++){
            triArr[i] = triArr[i-1] + triArr[i-5];
        }
        for(int i = 0 ; i < n ; i++){
            int target = Integer.parseInt(br.readLine());
            System.out.println(triArr[target]);
        }
    }
}