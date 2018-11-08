import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		//정수를 입력받아 홀수인지 짝수인지 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		if(sc.nextInt()%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
