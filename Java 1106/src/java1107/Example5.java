package java1107;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		int money = 0;
		int plus = 0;
		int min = 0;
		boolean run = true;
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(run) {
			System.out.println("======================");
			System.out.println("1.예금 | 2.출금 || 3. 잔고 ||4. 종료");
			System.out.println("======================");
			sel = sc.nextInt();
			if(sel>4) {
				System.out.println("다시입력하세요");
			}
			
			switch(sel) {
			case 1 : 
				System.out.println("예금금액");
				money += sc.nextInt();
				System.out.println("입금완료>");
				break;
			case 2 :
				if(money==0) {
					System.out.println("텅장입니다");
				}else {
				System.out.println("출금금액");
				min = sc.nextInt();
				}
				if(min>money) {
					System.out.println("잔고부족");
				}else {
					money -= min;
					System.out.println("출금완료>");
				}
				
				//System.out.println(min);
				
				break;
			case 3 :
				System.out.println("현재 남은 잔액은"+money+"입니다.");
				break;
			case 4 :
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
		
		}
	}

}
