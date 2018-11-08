package java1108;

public class Example1 {

	public static void main(String[] args) {

		double[][] arr = { { 97.5, 89.7 }, { 100, 98.1 }, { 52.1, 32.5 }, { 78.7, 97.0 } };

		double sum = 0;
		int i = 0;
		double count = 0;

		for (i = 0; i < arr.length; i++) { //arr.length는 arr[0~3]까지 돌 수 있는 for문
			for (int j = 0; j <arr[i].length; j++) { //arr[i]의 길이값은 2
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum / count);

	}
}
