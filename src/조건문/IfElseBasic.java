package 조건문;

public class IfElseBasic {
	public static void main(String[] args) {
        int num = 39; 
		
		// % 앞에 값을 뒤에서 나눈다음 나머지를 출력해준다. 정수일 때만 의미가 있다. 
		// num % 2 == 0 의 의미는 2배수 즉 짝수를 의미한다. 나머지가 1이 나올때 홀수 이다. 
		if(num % 2 == 0) { 
			System.out.println("값은 짝수입니다.");  // true 일때, 조건 수행
		}else { 
			System.out.println("값은 홀수입니다.");	// false 일때, 조건 수행
		}
		System.out.println("프로그램을 종료합니다.");  
		

	}

}
