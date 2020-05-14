package Object_Class;

import java.math.BigInteger;  // .math 안에 다양한 수학적인 기능들이 들어있다. 

public class SoBigInteger {

	public static void main(String[] args) {
		System.out.println("최대정수 : " + Long.MAX_VALUE); 
		System.out.println("최소정수 : " + Long.MIN_VALUE); 
		// java에서 담을 수 있는 가장 큰 정수 값 = Long.MAX_VALUE = 2의64승 ( 음수-9223372036854775808/ 0 / 양수:9223372036854775807) 자리수 : 19
        // 이 이상의 수는 표현할 수 없다. 그래서!!
		
		// Long num1 = 10000000000000000000; //  20자리 error : 담을 수 있는 범위 초과.  
	    //  Long num2 = -9999999999999999999; // 19자리 지만 Long 의 최소값보다 더 작음
		
		// Long 이범위가 넘어가는 값을 표현 (BigInteger)
		BigInteger bigValue1 =  new BigInteger("10000000000000000000"); // 문자열 형태로 입력을 받는다. 
		BigInteger bigValue2 =  new BigInteger("-99999999999999999999");
		
		BigInteger mulResult =  bigValue1.multiply(bigValue2);
		System.out.println("큰 수의 곱셉 결과 " + mulResult);
		
		BigInteger addResult = bigValue1.add(bigValue2);
		System.out.println("큰 수의 덧셈 결과 : " + addResult);
	

	}

}
