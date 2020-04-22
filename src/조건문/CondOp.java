package 조건문;

public class CondOp {
	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big = 0, diff = 0;
		
		if(num1 > num2) {
			System.out.println("num1이 num2 보다 크다.");
			big = num1; 
			diff = num1 - num2; 
			
		}else {
			System.out.println("num1이 num2 보다 작다.");
			big = num2; 
			diff = num2 - num1; 
			
		} //num1이 num2 보다 작다.
		
		System.out.println("큰 값:"+big+", 두 값의 차:"+diff); // 출력 값: 큰 값:100, 두 값의 차:50

		
	
        // 삼항 연산자/조건연산자(? : - 피연산자가 3개 ) (단한 연산자!, ++, -- 등...) 대부분 2항연산자(비교, 산술, 논리 등...) 
		// ? 앞에는 boolean 의 값만 올 수 있다. 직접적으로 true ,false 를 넣는 것이 아닌 비교연산자, 논리연산자를 넣는다. 
		// true의 값 조건   :  false의 값 조건을 수행 한다.
		// 간단한 형태의 결과를 빠르게 받아보고 싶을 때 사용한다. 		
		
		big = (num1 > num2)? num1:num2 ;
		diff = (num1 > num2)?num1 - num2:num2 - num1; 
		System.out.println("큰 값:"+big+", 두 값의 차:"+diff); // 출력 값 : 큰 값:100, 두 값의 차:50
		
		
	}

}
