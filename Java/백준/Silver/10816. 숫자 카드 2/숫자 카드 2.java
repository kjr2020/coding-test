/**
Map에 카드를 키, 개수를 value로 해서 저장 후,
구해야할 M개에 대해서 contains 실행 -> 없으면 0 출력
Map.getOrDefault 함수는 값을 반환하는 함수
**/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int cur =Integer.parseInt(st.nextToken()); 
            cards.put(cur, cards.getOrDefault(cur, 0) + 1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            sb.append(cards.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
        }
        
        System.out.println(sb);
    }
}