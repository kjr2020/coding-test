import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Practice_6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String getInput = br.readLine();
        StringTokenizer st = new StringTokenizer(getInput);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] isPanda = new int[N][M];
        int[] pandaX = new int[K];
        int[] pandaY = new int[K];
        int answer = 0;
        int distance = 0;

        for(int i = 0 ; i < K ; i++){
            getInput = br.readLine();
            st = new StringTokenizer(getInput);
            pandaY[i] = Integer.parseInt(st.nextToken());
            pandaX[i] = Integer.parseInt(st.nextToken());
        }

        int sumX = 0;
        int sumY = 0;

        int sumXSquare = 0;
        int sumYSquare = 0;

        for(int i = 0 ; i < K ; i++){
            sumX += pandaX[i];
            sumY += pandaY[i];
            sumXSquare += pandaX[i] * pandaX[i];
            sumYSquare += pandaY[i] * pandaY[i];
            isPanda[pandaY[i]-1][pandaX[i]-1] = 1;
        }


        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                distance = 0;
                if(isPanda[i][j] == 0){
                    distance = K*(i+1)*(i+1) - 2 * sumY * (i+1) + sumYSquare + K*(j+1)*(j+1) - 2 * sumX * (j+1) + sumXSquare;
                    if(answer == 0 || answer > distance){
                        answer = distance;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
