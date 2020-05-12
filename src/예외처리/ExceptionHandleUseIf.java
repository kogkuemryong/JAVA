package 예외처리;

import java.util.Scanner;

public class ExceptionHandleUseIf {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	 	
		System.out.print("피제수 입력 : "); 
		int num1 = input.nextInt();
		
		System.out.println("제수 입력 : ");
		int num2 = input.nextInt();
		
		if(num1 == 0 || num2 ==0) { // 예외처리 & 기능의 조건 체크 
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		
		
		int result = num1/num2;
		System.out.printf("%d / %d = %d \n", num1, num2, result);
		

	}

}
