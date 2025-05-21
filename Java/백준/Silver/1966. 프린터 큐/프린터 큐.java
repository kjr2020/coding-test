import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 테스트케이스 수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());     // 문서 개수
            int target = Integer.parseInt(st.nextToken()); // 찾고 싶은 문서의 인덱스

            Deque<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
            int[] priorityCount = new int[10]; // 중요도 1~9 카운팅용

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int priority = Integer.parseInt(st.nextToken());
                priorityCount[priority]++;
                queue.add(new AbstractMap.SimpleEntry<>(j, priority)); // (인덱스, 중요도)
            }

            int count = 0;
            while (!queue.isEmpty()) {
                Map.Entry<Integer, Integer> current = queue.peekFirst();
                int currPriority = current.getValue();

                // 현재 문서보다 높은 중요도가 있는지 검사
                boolean hasHigher = false;
                for (int p = currPriority + 1; p < 10; p++) {
                    if (priorityCount[p] > 0) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    queue.removeFirst();
                    queue.addLast(current); // 뒤로 보냄
                } else {
                    // 출력
                    queue.removeFirst();
                    priorityCount[currPriority]--;
                    count++;

                    if (current.getKey() == target) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}