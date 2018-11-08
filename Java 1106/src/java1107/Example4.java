package java1107;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
//점수, 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력
	//단 4학년은 70점 이상이어야 합격
		
		int grade = 0;
		int score = 0;
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("학년을 입력하세요");
			grade = sc.nextInt();
			System.out.println(">");
	
			switch(sel) {
			case 1 :
				System.out.println("1학년");
				System.out.println("점수입력하세요");
				score = sc.nextInt();
				if(score>=60) {
					System.out.println("합격입니다.");
				}else{
					System.out.println("불합격입니다.");
				}
			case 2 :
				System.out.println("2학년");
				System.out.println("점수입력하세요");
				score = sc.nextInt();
				if(score>=60) {
					System.out.println("합격입니다.");
				}else{
					System.out.println("불합격입니다.");
				}
			case 3 :
				System.out.println("3학년");
				System.out.println("점수입력하세요");
				score = sc.nextInt();
				if(score>=60) {
					System.out.println("합격입니다.");
				}else{
					System.out.println("불합격입니다.");
				}
			case 4 :
				System.out.println("4학년");
				System.out.println("점수입력하세요");
				score = sc.nextInt();
				if(score>=70) {
					System.out.println("합격입니다.");
				}else{
					System.out.println("불합격입니다.");
				}break;
			}	
		}
		
	
	}

}
