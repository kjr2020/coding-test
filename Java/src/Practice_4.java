public class Practice_4 {
    /*
    * 프로그래머스
    * 없는 숫자 더하기
    */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;

        for(int number : numbers){
            answer -= number;
        }

        System.out.println(answer);
    }
}
