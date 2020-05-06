package 콘솔;

import java.util.Scanner; // ctrl + shift + o 누르면 바로 import 된다.  

public class StringScanner {
	public static void main(String[] args) {
		// 문자형(수치형 데이터)으로 되어 있는 정수로 변환해서 반환해주려면? 
		String source = "1 5 7"; 
	
		Scanner scanner = new Scanner(source); 
		
		int num1 = scanner.nextInt(); // 자료형 String  을 int  로 변환
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1 + num2 + num3; 		
		System.out.printf("문자열에 저정되어 있는 num1 = %d , num2 = %d , num3 = %d , sum = %d"
				                    , num1, num2, num3, sum);
		
		// scanner 은 keyboard 의 입력 받는 것이 아니라 다양한 리소를 입력 받을 수 있도록 정의 되어있다. 
		// 위의 경우 String의  source를 입력 받아 int 형으로 변환해서 반환할 수 있도록 해준다. 

		
    
		
		
	}

}
