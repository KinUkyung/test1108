package java1107;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
//랜덤으로 숫자 꺼내기~
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int i = 0;
		boolean run = true;
		int com = (int) ((Math.random() * 100) + 1);

		while (run) {
			System.out.println("입력하세요>>");
			i = sc.nextInt();
			count++;
			if (i > 100) {
				System.out.println("다시입력하세요");
			}
			if (i < com) {
				System.out.println("Up");
			} else if (i > com) {
				System.out.println("Down");
			} else {
				System.out.println("맞았습니다." + count + "회 실행");
				break;
			}

		}

	}
}
