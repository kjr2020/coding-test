import java.io.*;

public class Main {
    static long[] fib;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int absN = Math.abs(n);
        fib = new long[absN + 2]; // +2: n=0,1도 안전하게 처리
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= absN; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1_000_000_000;
        }

        long result = fib[absN];
        int sign;

        if (n == 0) sign = 0;
        else if (n > 0) sign = 1;
        else sign = (absN % 2 == 0) ? -1 : 1;

        System.out.println(sign);
        System.out.println(result);
    }
}