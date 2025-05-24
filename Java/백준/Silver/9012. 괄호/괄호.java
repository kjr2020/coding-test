/**
입력을 캐릭터 배열로 만든 다음 순회하면서 '(' 를 만나면 스택에 push,
')' 를 만나면 스택에서 pop, pop할게 없는데 pop을 시도하면 현재 인덱스를 기억하고 반복문 탈출
=> 인덱스를 기억하고 반복문 탈출하면 마지막에서 틀린 예시를 잡을 수 없음을 확인
=> boolean 변수로 flag를 만들어 제대로 마쳤는지, 오류가 난건지 여부를 판단하기로 바꿈
포문이 끝나면 스택이 비어있는지 여부, 캐릭터 배열을 끝까지 순회했는지 여부를 보고 답 출력
**/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            char[] vps = br.readLine().toCharArray();
            Stack<Character> stacks = new Stack<>();
            boolean isValid = true;
            for(int j = 0 ; j < vps.length ; j++){
                if(vps[j] == '('){
                    stacks.push(vps[j]);
                }
                if(vps[j] == ')'){
                    if(stacks.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stacks.pop();
                }
            }
            if(stacks.isEmpty() && isValid) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        
        System.out.println(sb);
    }
}