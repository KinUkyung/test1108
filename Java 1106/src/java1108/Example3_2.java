package java1108;

import java.util.Scanner;

public class Example3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int stNum = 0; // 학생수 만큼의 배열 크기를 지정하는 변수
		int[] scores = null;// 배열만 선언하고 사이즈 지정을 하지 않겠다 라는 배열변수

		while (run) {
			System.out.println("===================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
			System.out.println("===================================");

			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("학생수>>");
				stNum = sc.nextInt(); // 정수값을 입력받아서 stNum에 저장

				scores = new int[stNum];
				//
//int[] scores = new int[stNum] 여기서 선언이되면 1번sel에서만 사용할 수 있는 변수가 되어버림
//그래서 위에 먼저 scores변수를 먼저 선언해놓고 작업해야됨

			} else if (sel == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 : ");
					scores[i] = sc.nextInt();
				}
			} else if (sel == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 : "+scores[i]);
				}
			} else if (sel == 4) {
				int max = 0, sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최고점수 :" + max);
				System.out.println("평균점수 :" + avg);
			} else if (sel == 5) {
				run = false;
			}

		}

	}
}
