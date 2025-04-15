import java.util.*;
import java.io.*;

public class Main{
    
    static int[][] map;
    static int answer;
    static int h;
    static int w;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String mapSize = br.readLine();
        while(!mapSize.equals("0 0")){
            StringTokenizer st = new StringTokenizer(mapSize);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            
            answer = 0;
            
            map = new int[h][w];
            
            for(int i = 0 ; i < h ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w ; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            for(int i = 0 ; i < h ; i++){
                for(int j = 0; j < w ; j++){
                    if(map[i][j] == 1) {
                        answer++;
                        isIsland(j, i);
                    }
                }
            }
            
            sb.append(answer).append("\n");
            mapSize = br.readLine();
            
        }
        System.out.println(sb);
    }
    
    static void isIsland(int x, int y){
        if(map[y][x] != 1) return;
        map[y][x] = -1;
        if(x-1 >= 0) {
            isIsland(x-1, y);
            if(y-1 >= 0){
                isIsland(x-1, y-1);
            }
            if(y+1 < h){
                isIsland(x-1, y+1);
            }
        }
        if(y-1 >= 0){
            isIsland(x, y-1);
            if(x+1 < w){
                isIsland(x+1, y-1);
            }
        }
        if(x+1 < w){
            isIsland(x+1, y);
            if(y+1 < h){
                isIsland(x+1, y+1);
            }
        }
        if(y+1 < h) isIsland(x, y+1);
    }
}