package java1108;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int student = 0;
		int count = 0;
		double[] score = null;
		boolean run = true;
		int sel = 0;

		while (run) {
			System.out.println("===================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
			System.out.println("===================================");

			sel = sc.nextInt();

			switch (sel) {
			case 1:
				System.out.print("학생수 입력>>");
				student += sc.nextInt();
				score = new double[student];
				System.out.println();
				System.out.println(student + "명 입력되었습니다.");
				break;
			case 2:
				if (student != 0) {
					System.out.println("점수 입력>>");
				} else {
					System.out.println("저장 된 학생이 없습니다.");
				}

				for (int i = 0; i < score.length; i++) {

					System.out.println((i + 1) + "번 학생 점수 : ");
					score[i] = sc.nextDouble();

				}
				if (student != 0) {
					System.out.println("입력완료>>");
					System.out.println();
				}
				break;
			case 3:
				if (student != 0 && score.length !=0.0) {
					System.out.println("점수확인>>");
				} else {
					System.out.println("저장 된 학생이 없습니다.");
				}
				if (score.length != 0) {
					for (int i = 0; i < score.length; i++) {

						if (score.length != 0) {
							System.out.println((i + 1) + "번 학생 : " + score[i]);

						} if(score.length==0.0) {
							System.out.println("점수를 입력하지 않았습니다.");

						}
					}
				}
				break;
			case 4:
				int sum = 0;
				double max = 0;
				double min = 100;
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max < score[i]) {
						max = score[i];
					}
					if (min > score[i]) {
						min = score[i];
					}
				}
				System.out.println("합계 :" + " " + sum);
				System.out.println("평균 :" + " " + (double) sum / score.length);
				System.out.println("최고점 :" + " " + max);
				System.out.println("최저점 :" + " " + min);
				break;
			default:
				System.out.println("종료합니다>>");
				System.exit(0);

				break;

			}
		}

	}

}
