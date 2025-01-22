import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;


        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(int i = 0 ; i < N ; i++) {
            int find = arr[i];
            int start_cur = 0;
            int end_cur = N-1;

            while(start_cur < end_cur){
                if(arr[start_cur] + arr[end_cur] == find){
                    if(start_cur != i && end_cur != i){
                        answer++;
                        break;
                    } else if (start_cur == i){
                        start_cur++;
                    } else if (end_cur == i){
                        end_cur--;
                    }
                } else if (arr[start_cur] + arr[end_cur] < find){
                    start_cur++;
                } else {
                    end_cur--;
                }
            }
        }

        System.out.println(answer);
    }

}
