import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstDeno = Integer.parseInt(st.nextToken());
        int firstNum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int secondDeno = Integer.parseInt(st.nextToken());
        int secondNum = Integer.parseInt(st.nextToken());
        int gcd = gcd(firstNum, secondNum);
        int newNum = firstNum * secondNum / gcd;
        int newDeno = firstDeno * (newNum/firstNum) + secondDeno * (newNum/secondNum);
        int newGcd = gcd(newNum, newDeno);
        
        System.out.println(newDeno/newGcd + " " + newNum/newGcd);
    }
    
    private static int gcd(int a, int b){
        while(b != 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}