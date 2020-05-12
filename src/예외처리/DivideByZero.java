package 예외처리;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
        System.out.println("두 개의 정수를 입력 : ");
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// 예외나 error 처리하는 명령어- try{}catch(){}
		
		
		// ArithmeticException
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {              // 0으로 나누었을 때, ArithmeticException발생하는 예외.
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		System.out.println("프로그램 종료...");
	
	}

}
