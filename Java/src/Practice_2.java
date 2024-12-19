import java.util.Arrays;

public class Practice_2 {
    /*
    * 프로그래머스
    * 추억 점수
    */

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];
        int idx = 0;
        int tmp = 0;

        for(String[] target : photo){
            for(String photoedName : target){
                for(String selectedName : name){
                    if(photoedName.equals(selectedName)){
                        tmp += yearning[Arrays.asList(name).indexOf(selectedName)];
                        break;
                    }
                }
            }
            answer[idx++] = tmp;
            tmp = 0;
        }

        System.out.println(Arrays.toString(answer));
    }
}
