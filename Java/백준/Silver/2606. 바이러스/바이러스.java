import java.io.*;
import java.util.*;

public class Main {
    public static Map<Integer, List<Integer>> network;
    public static boolean[] isVirused;
    public static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 컴퓨터 개수
        network = new HashMap<>();
        int v = Integer.parseInt(br.readLine()); // 연결 개수
        isVirused = new boolean[N + 1];
        answer = 0;

        for (int i = 0; i < v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            // 양방향 연결을 저장해야 함
            network.putIfAbsent(first, new ArrayList<>());
            network.putIfAbsent(second, new ArrayList<>());

            network.get(first).add(second);
            network.get(second).add(first); // 양방향 추가
        }

        virussed(1);
        System.out.println(answer - 1); // 1번 컴퓨터 제외하고 출력
    }

    static void virussed(int computer) {
        if (isVirused[computer]) return;
        isVirused[computer] = true;
        answer++;

        if (network.containsKey(computer)) {
            for (int val : network.get(computer)) {
                virussed(val);
            }
        }
    }
}