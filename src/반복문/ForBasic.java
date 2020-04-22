package 반복문;

public class ForBasic {

	public static void main(String[] args) {
		// 괄호 안을 넣을 때, 가장 복잡한 반복문이다? 개발자들이 가장 많이 사용하는 반복문이 for 문이다. 
		// 두괄식으로 조건이 제시되어 있기 때문에 가독성이 좋다. 
		//( 초기식 ; 조건식; 증감식) = 초기식은 1번만 실행되고 조건식과 증감식은 조건식이 거짓이 될 때까지 진행한다. 
		int result= 0;
				
				
		/*
	    * for(int i =1 ; i <= 100 ; i++) { System.out.println("카운팅 값 : "+ i); result +=
	    * i; System.out.println("누적값 : " + result); }
	    * System.out.println("1~100까지의 합 : " + result);
		*/
					
		
		//1. 1~100까지 2의 배수이면서 5의 배수인 숫자를 출력 하고, 
		//그 출력된 숫자들의 합을 구하는 프로그램을 for문 을 사용하여 작성. 
		 
		
		for(int num = 1; num <= 100; num++) { 
			if(num % 10 == 0) {
			      System.out.println("카운팅 값 : "+ num); 
				  result +=num ; 
				  }
			  }
			      System.out.println("1~100 안에서 2와5의 배수의 합 : " +result);

	}
}

