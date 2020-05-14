package Object_Class;

import java.math.BigDecimal;

public class SoBigDecimal {

	public static void main(String[] args) {
		
		double e1 = 1.6;
		double e2 = 0.1;
		
		BigDecimal  e3 = new BigDecimal("1.6"); // 문자열의 형태로 초기화 
		BigDecimal  e4 = new BigDecimal("0.1");
		
		
		System.out.println("두 실수의 덧셈 결과 :" + (e1 +e2)); // 근사치 값으로 표현되기 때문에 오차가 발생한다. 
		System.out.println("두 실수의 덧셈 결과 :" + (e1 *e2));
		
		System.out.println("두 실수의 덧셈 결과 :" + (e3.add(e4))); // 정확한 결과를 나타내준다. 
		System.out.println("두 실수의 덧셈 결과 :" + (e3.multiply(e4)));
		
	}

}
