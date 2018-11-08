import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

	//오늘은 2007년 1월1일 월요일 2007년 x월y일은 무슨요일?
		
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		int date = 0;
		

			for(int i=1; i<=month; i++) {
				if(i==1&&i==3&&i==5&&i==7&&i==8&&i==10&&i==12){
				 date += 31;
				System.out.println(month+date);	
				}
				}
					
		
		
	}

}
