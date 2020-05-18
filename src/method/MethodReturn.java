package method;

public class MethodReturn {

	public static void main(String[] args) {
        int num = 0;
		
		num = mulifly(1234,546); 
		
		if (num > 50000) {
			System.out.println("50000이상 이군요.");
		}
		
		System.out.println("프로그램 종료...");
		
	} 
	    // main 의 값이 끝나는 순간 num 이 사라진다. 그전까지는 여전히 존재하고 있으므로 재사용이 가능하다. 
	
	
	public static int mulifly(int num1, int num2) {
		int result =0;
		
		result = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + result);
		
		return result;  
		
	    // multify의 result 의 값을 main method 에서 사용할 수 없다. 
		// return result; 하는 순간   int num1, int num2의 이름을 지워버린다. 
		// int num1, int num2의  재사용 할 수 있게 해준다. 
		// return result; 복귀가 완료가 되면 result 가 사라진다. 
		// public static int mulifly(int num1, int num2) {
		// int result =0; 수행하는 순간에만 살아 있고 벗어나게 되면 사라져 버린다. 
		// 소멸 시키는 이유 : java에서 메모리를 다 할당하면 다른 운영체제에게도 할당할 메모리량이 부족하기 때문이다. 
		// 초기 값을 설정해줘야지 하는 이유 그것이다. 선언과 동시에 꼭 초기화 하는 습관을 가지는 것이 중요하다. 
		// int : 0, double :0.0, boolean : true, string : "", char : ' '
		
		
		// 복기 할 때, 값도 같이 복귀 될 수 있을까?
		// return 호출한 값을 가지고 복귀 한다. 
		// 	mulifly(15,94); 은 사라지면서 결과 값이 그 자리에 남게 된다. 
		// 결과 값의 자료 형도 int 값으로 나오기 때문에 변수로 저장 시켜준다. 
		// public static (int) mulifl 라는고 인식시켜야 한다. 
		// public static (    ) mulifl  : 괄호의 자리는 복귀할 때 반환하게 되는 자료형을 의미한다. 
		// void : 수행이후 아무런 값도 반환 하지 않는 method 입니다. 
		
		// 	num = mulifly(1234,546);  --> int num1, int num2 괄호의 값이 각각 저장이 된다. 
		// result = num1 * num2; 이 식을 수행해준다. 
		// System.out.println(num1 + " x " + num2 + " = " + result); 출력한 이후
		// 출력한 쪽으로 복귀 할 것이다. num = mulifly(1234,546); 저장 해주고 
		// 필요할 때마다 num 의 값으로 사용할 수 있게 된다. 
		// 값을 가지고 추가적으로 수행하고 싶은 것이 있을 때 사용한다. 
		
		/*
		 * 출력 결과: 
		 * 1234 x 546 = 673764 
		 * 50000이상 이군요. 
		 * 프로그램 종료...
		 */
		

	}

}
