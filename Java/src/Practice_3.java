public class Practice_3 {
    /*
    * 프로그래머스
    * 삼총사
    */
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        int answer = 0;

        for(int i = 0 ; i < number.length ; i++){
            for(int j = i+1 ; j < number.length ; j++){
                for(int k = j+1 ; k < number.length ; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
