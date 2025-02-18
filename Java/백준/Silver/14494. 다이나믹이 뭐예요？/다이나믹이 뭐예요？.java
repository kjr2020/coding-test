import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static long[][] dp;  // int → long으로 변경
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dp = new long[n + 1][m + 1];  // long 배열로 변경

        // 초기값 설정: (1,1) 위치는 경로 1개
        dp[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) continue; // 시작점은 이미 설정됨
                dp[i][j] = ((i > 1 ? dp[i - 1][j] : 0)  // 위쪽에서 오는 경우
                          + (j > 1 ? dp[i][j - 1] : 0)  // 왼쪽에서 오는 경우
                          + (i > 1 && j > 1 ? dp[i - 1][j - 1] : 0)) % MOD; // 대각선에서 오는 경우
            }
        }

        System.out.println(dp[n][m]);
    }
}