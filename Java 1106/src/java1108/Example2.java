package java1108;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 문제의 답을 맞추기 위해 Scanner사용
		String[][] quiz = { { "Water", "물" }, { "Chair", "의자" }, { "Pen", "펜" }, { "Book", "책" }, { "Mouse", "쥐" } };
		// 2차원배열을 사용하여 배열설정
		int count = 0; // 문제의 1번 2번 3번을 위한 count변수 사용
		int score = 0;
		String an = null;
		for (int i = 0; i < quiz.length; i++) { // quiz라는 배열의 길이만큼 반복하는 for문사용
			count++; // 한번 돌 때마다 count는 1씩 증가하면서 1번, 2번, 3번이라는 숫자를 표시함
			System.out.println("문제 " + count+"번"+" :"+" " + quiz[i][0] + "는 무엇인가요?"); // count는 1로 설정이 되고, quiz[i]에서 처음으로 도는 Water가 문제로 나오게되고, [watwe][물]
			//물이 i.length의 1번째 배열이고 [0]번째 배열이 없기때문에[0]이라고 표기하여 아무것도 안나오게 설정
			an = sc.next(); //답은 Scanner로 입력하여 받는 것으로 설정
			if (an.equals(quiz[i][1])) { //만약 내가 적은 답이 i.length의 [1]번과 같다면==quiz[i][1]이라면!
				System.out.println("정답입니다");
				score++;
				System.out.println();
			}else { //답이 다르다면
				System.out.println("땡");
				System.out.println();
				
				System.out.println("정답은" + quiz[i][1] + "입니다."); //답을 표시해줌
			}
			// for(int j=0; j<quiz[i].length; j++) {

		}System.out.println("총"+score+"개를 맞췄습니다.");
		double per = 100*((double)score/quiz.length);
		System.out.println("정답률은 "+per+"% 입니다");
	}

}
