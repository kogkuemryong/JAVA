package 예외처리;

import java.util.Scanner;

public class ExceptionOtherTryCatch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5]; 
		
		for(int i = 0; i <2 ; i++)
			
		try {
			System.out.println("피제수 입력: ");
			int num1 = input.nextInt();
			
			System.out.println("제수 이력: ");
			int num2 = input.nextInt();
			
			System.out.print("연산 결과를 저장할 배열의 인덱스(0~4) 입력 : ");
			int index = input.nextInt();
			
			arr[index] =  num1 / num2;
			
		// 예외가 나눗셈 이외의 것도 있을 수 있을 때, 여러개를 사용할 수 있다. 
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 인덱스 접근 에러 발생.");
		}
		


	}

}
