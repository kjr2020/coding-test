/**
result 배열은 돌이 n개일때 SK가 이기는지를 나타냄
지면 false, 이기면 true
**/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stoneGame = new int[n];
        boolean[] result = new boolean[1000];
        result[0] = false;
        result[1] = true;
        result[2] = false;
        result[3] = true;
        for(int i = 4 ; i < 1000 ; i++){
            if(!result[i-4]){
                result[i] = true;
                continue;
            }
            if(!result[i-3]){
                result[i] = true;
                continue;
            }
            if(!result[i-1]){
                result[i] = true;
                continue;
            }
            result[i] = false;
        }
        if(result[n-1]) System.out.println("SK");
        else System.out.println("CY");
    }
}