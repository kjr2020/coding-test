// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] target = input.toCharArray();
        Map<Integer, Set<String>> map = new HashMap<>();
        int answer = 0;
        //부분 문자열 길이
        for(int i = 0 ; i < input.length() ; i++){
            map.putIfAbsent(i, new HashSet<>());
            //부분문자열 다루는 부분
            for(int j = 0 ; j < input.length() - i ; j++){
                map.get(i).add(input.substring(j, j+i+1));
            }
        }
        System.out.println(map.values().stream().mapToInt(Set::size).sum());
    }
}