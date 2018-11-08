import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 100;
		int a = 0;
		int sum = 0;

		while (true) {
			a++;
			if (a % 2 == 1) {
				sum += a;
				if (sum < 100) {
					// System.out.print(a);
				}
			}
			if (a % 2 == 0) {
				sum -= a;

			}
			if (sum == 100) {
				System.out.println(a);
				break;
			}
		}
	}
}
