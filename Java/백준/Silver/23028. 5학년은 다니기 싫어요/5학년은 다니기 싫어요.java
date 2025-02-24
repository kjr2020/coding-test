import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 현재까지 마친 학기 수
        int A = sc.nextInt(); // 현재 전공 학점
        int B = sc.nextInt(); // 현재 총 학점

        int remainingSemesters = 8 - N; // 남은 학기 수

        int[][] courses = new int[10][2]; // 전공(X)과 비전공(Y) 과목 개수
        for (int i = 0; i < 10; i++) {
            courses[i][0] = sc.nextInt(); // 전공 과목 개수
            courses[i][1] = sc.nextInt(); // 비전공 과목 개수
        }

        // 현재 학점이 졸업 조건을 만족하면 즉시 종료
        if (A >= 66 && B >= 130) {
            System.out.println("Nice");
            return;
        }

        int semesterIndex = 0;
        while (remainingSemesters > 0 && semesterIndex < 10) {
            int X = courses[semesterIndex][0]; // 전공 개설 수
            int Y = courses[semesterIndex][1]; // 비전공 개설 수
            
            int majorTaken = Math.min(6, X); // 전공을 최대로 들을 수 있는 개수
            int remainingSlots = 6 - majorTaken; // 비전공을 들을 수 있는 자리
            int nonMajorTaken = Math.min(remainingSlots, Y); // 비전공 수강 개수

            // 학점 추가
            A += majorTaken * 3;
            B += (majorTaken + nonMajorTaken) * 3;

            // 졸업 조건 확인
            if (A >= 66 && B >= 130) {
                System.out.println("Nice");
                return;
            }

            semesterIndex++;
            remainingSemesters--;
        }

        // 8학기 내에 졸업이 불가능한 경우
        System.out.println("Nae ga wae");
    }
}