package 예외처리;

public class FinallyTest {

	public static void main(String[] args) {
	boolean divOk = divider(4,2);
		
		if(divOk) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
		
		divOk = divider(16,0);
		
		if(divOk) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
		
	
	}
	public static boolean divider(int n1, int n2) {
		
		try {
			int result = n1 / n2;
				return true;	 //1. 값을 반환한 것이 있으면, 호출한 쪽으로 가져간다. 2. method에서 나가서 호출한쪽으로 나간다. 
			
		}catch(ArithmeticException  e) {
			System.out.println("나숫셈 불가능");
			return false;
			
		}finally { // finally = return 을 만나도 복귀 하는 것이 아니라 finally를 실행되고 복귀한다.  
			System.out.println("finally 실행.");
		}

// finally 정상적으로 수행되든 , 예외가 존재하든 상관 없이 반드시 한번은 수행되어지는 구문이다. 무조건 사용되어야 하는 것은 아니다. 
// 변수 값을 초기화 하여 재사용 해야하는 상황 등에서 사용된다. 마지막으로 정리해야하는 작업이 있을 때 finally에 넣어서 사용한다. 

// 문법적으로는 문제는 없지만 논리적으로나 물리적으로 문제가 되는 경우는 ex) 나이 값을 음수로 넣었다면?? 
// 프로그래머 스스로 예외상황이 발생했을 때 처리하도록 문법 구문을 제공한다.  
// <예외 처리 자료문>

	}
}	

