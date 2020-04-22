package 반복문;

public class DoWhileBasic {

	public static void main(String[] args) {
int num = 1, result = 0;
		
		// 1~100의 합 = ?
		
		do { 
			if(num % 10 == 0) {
			System.out.println("카운팅 값 : "+ num);
			result += num;
			System.out.println("누적값 : " + result);}
			num++;		
		}while(num <= 100);
		
		System.out.println("1~100까지의 합 : " + result);
		
		// 무한 반복이 걸리지 않게 주의! , 원하는 만큼의 횟수만 출력될 수 있게 만들어야한다.
		// while 문과 do while 문의 차이점은? 
		// do while 문은 한번은 실행을 한 이후에 조건을 체크한다. 
		// while 문은 처음부터 조건을 확인하기 때문에 한번도 출력되지 않을 수 있다. 
		

	}

}
