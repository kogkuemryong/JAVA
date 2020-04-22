package 조건문;

public class If_Elseif_Else { // if 조건문은 언제든지 중첩이 가능하다. 
	public static void main(String[] args) {
		
		int birth = 1992; // 변수 선언 및 초기화
		int age = 0; // error 발생하지 않도록 0으로 우선 넣어둔다. 
		
		age = 2020 - birth + 1;
		
		System.out.println("당신의 나이는"+age+"살 이군요.");
		// 변수라는 기능 때문에 필요할 때마다 가져와서 수행할 수 있도록 해준다. 

		if(age < 10) { 
			System.out.println("10대 미만입니다.");
		}else {  // age >= 10
			
			if(age < 20) { // 10<= age < 20
				System.out.println("10대 입니다.");	
			}else { // age >= 20 
				if(age < 30) { // 20<= age <30
					System.out.println("20대 입니다.");	
				}else {
					System.out.println("30대 이상입니다.");			
				}  // 계산 되어진 값을 추가적인 명령을 java 에 내려줄 수 있다.               				
			}		// 수단 ( c++, 파이썬 ) 만 다르다. 
		}	
	}


/*
 * 위의 if else 문 편집 
 
 * if(age < 10){ 
 *     System.out.println("10대 미만입니다."); 
 * }else if(age < 20){  // 10<= age < 20
 *     System.out.println("10대 입니다."); 
 * }else if(age < 30){ // 20<= age <30
 *     System.out.println("20대 입니다."); 
 * }else {System.out.println("30대 이상입니다.");
*/




	

}
