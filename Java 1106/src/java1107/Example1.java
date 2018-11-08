package java1107;

public class Example1 {

	public static void main(String[] args) {

			int result = 0;
			int s = 1;//음수, 양수로 만들어주기 위한 변수
			int num = 0;//1,-2,3,-4...숫자를 만들어주는 변수
			
			for(int i=1; true; i++) {//조건식을 true로 하면 무한반복
				num =  i * s;
				result = result + num;
				s = -s;
				System.out.println(num);
				if(result>=100) {
					break;
				}
			}
			System.out.println("num"+num);
			System.out.println("result"+result);
	}

}
