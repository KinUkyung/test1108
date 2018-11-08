package java1107;

public class Example2 {

	public static void main(String[] args) {
//2x+4y=10의 모든 해를 구하고 0<x y<=10 모두 정수

		int x = 0;
		int y = 0;

		for (int i = 0; i < 10; i++) {
			x = 2 * i;
			//System.out.println(i);
			for (int j = 0; j <= 10; j++) {
				y = 4 * j;
				//System.out.println(j);

				if ((x+y) == 10) {
					System.out.println(i + "," + j);
				}

			}
		}
		
	}
}
