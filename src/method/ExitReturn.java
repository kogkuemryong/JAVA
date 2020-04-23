package method;

public class ExitReturn {

	public static void main(String[] args) {
		   divide(10,5);
		     //divide(50,0); -- error : 수학적으로 0으로 나눌 수 없기 때문에 java에서도 오류를 이르킨다. 
		    divide(50,0);
		    
		}

		public static void divide (int num1, int num2 ) {
			int result = 0;
			
			if(num2 ==0) {
				System.out.println("나눗셈은 0으로 나눌 수 없어요.");
				return ;
			} 
			    result = num1 / num2; 
			    System.out.println(num1+" / "+num2+" = "+result);
			  
			 
			    // return : 값을 반환 할 때만 사용하는 것이 아니라, 값이 없을 때 호출한 쪽으로 복귀를 시킬 때 사용한다. 
			    		
			    		
			    		
		}

		// 변수의 이름과 method 이름을 짓는 방식이 같다. 
		// 변수의 이름은 일반적으로 명사로 이름으로 시작하고 , method 의 이름은 동사로 이름을 시작한다. 
		// 매개변수 : method 정의 할 떄의 변수 	
		// -- public static void divide (int num1, int num2 ) 괄호 안의 값.
		// 인자 : method 호출 될 때의 변수 	divide(10,5); 괄호 안의 값.	
		
		
	}


