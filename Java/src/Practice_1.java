import java.util.Arrays;

public class Practice_1 {
        /*
        * 프로그래머스: 정수를 나선형으로 배치하기
        */
        public static void main(String[] args) {
            int N = 5;
            int[][] answer = new int[N][N];
            int val = 1;
            int size = N;
            int start =0;
            while(size >= 1){
                for(int j = 0 ; j < size ; j++){
                    answer[start][j+start] = val++;
                }
                for(int j = 1 ; j < size ; j++){
                    answer[j+start][start+size-1] = val++;
                }
                for(int j = 1 ; j < size ; j++){
                    answer[start + size - 1][start + size - 1 - j] = val++;
                }
                for(int j = 1 ; j < size - 1 ; j++){
                    answer[start + size - j - 1][start] = val++;
                }
                start++;
                size -= 2;
                if(size == 1) {
                    answer[start][start] = val;
                    break;
                }

            }
            for(int j = 0 ; j < N ; j++){
                System.out.println(Arrays.toString(answer[j]));
            }
        }
}
