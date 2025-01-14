import java.util.*;
import java.io.*;

public class Practice_8 {

    /*백준 - 사과와 바나나 나눠주기(14914)*/

    public static void main(String args[]) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int apple = Integer.parseInt(st.nextToken());
        int banana = Integer.parseInt(st.nextToken());
        ArrayList<Integer> commonDivisors = new ArrayList<Integer>();
        int min = apple > banana ? banana : apple;

        for(int i = 1 ; i <= min ; i++){
            if(apple%i == 0 && banana%i == 0){
                commonDivisors.add(i);
            }
        }

        for(Integer commonDivisor : commonDivisors){
            System.out.println(commonDivisor + " " + apple/commonDivisor + " " + banana/commonDivisor);
        }
    }
}
