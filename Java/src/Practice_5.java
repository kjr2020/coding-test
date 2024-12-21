import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String getInput = br.readLine();
        StringTokenizer st = new StringTokenizer(getInput);
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int location = Integer.parseInt(st.nextToken());
        int increment = 0;
        int[] lastCutIncrement = new int[N];
        int[] H = new int[N];
        getInput = br.readLine();
        st = new StringTokenizer(getInput);
        for(int i = 0 ; i < N ; i++){
            H[i] = Integer.parseInt(st.nextToken());
        }
        getInput = br.readLine();
        int Q = Integer.parseInt(getInput);
        getInput = br.readLine();
        st = new StringTokenizer(getInput);
        for( int i = 0 ; i < Q ; i++){
            int actualHeight = H[location - 1] + increment - lastCutIncrement[location - 1];

            // 현재 위치 나무 벌목
            if (actualHeight >= M) {
                answer += actualHeight; // 목재량 추가
                lastCutIncrement[location - 1] = increment; // 현재 시점의 증가량 기록
                H[location - 1] = 0;
            }

            switch(st.nextToken()){
                case "L":
                    --location;
                    if(location == 0 ) location = N;
                    break;
                case "R":
                    ++location;
                    if(location > N) location = 1;
                    break;
            }

            increment++;
        }
        System.out.println(answer);

    }
}
