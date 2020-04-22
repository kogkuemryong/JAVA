package 반복문;

public class LoopBreak {

	public static void main(String[] args) {
		System.out.println("*1~100 사이의 (양의) 짝수를 출력");
		for(int i = 1; i <=100 ; i++) {
			
			if (i % 2 == 0) {
			System.out.println("카운트 변수 : " + i);
			}
		}
		
		
		
		System.out.println("*1~100 사이의 (양의) 5의 배수를 출력");
		for(int i = 1; i <=100 ; i++) {
			
			if (i % 5 == 0) {
			System.out.println("카운트 변수 : " + i);
			}
		}
			
		System.out.println("*1~100 사이의 (양의) 5의 배수 이면서, 7의 배수 출력");
			
		for(int e = 1; e <=100 ; e++) {
			if (e % 35 == 0) { // ((e % 5 ==0) %% (e % 7 ==))
			System.out.println("카운트 변수 : " + e);	
			}
			}
				
		System.out.println("*1~100 사이의 (양의) 5의 배수 이면서, 7의 배수 첫 정수만 출력");
				
		for(int y = 1; y <=100 ; y++) {
			if (y % 35 == 0) { // ((y % 5 ==0) %% (y % 7 ==))
			System.out.println("카운트 변수 : " + y);	
			break;
			}
		}
				
			
		System.out.println("*1~100 사이의 (양의) 5의 배수 이거나 7의 배수인 정수만 출력");
			 
		for(int y = 1; y <=100 ; y++) { 
		    if ((y % 5 ==0) || (y % 7 == 0)) {
			System.out.println("카운트 변수 : " + y);
			} 
		}
			
				
	    System.out.println("*1~100 사이의 (양의) 5의 배수 이고 7의 배수인 정수만 출력");
		for(int x = 1; x <=100; x++) {
			if ((x % 5 !=0) || (x % 7 != 0)) {
			System.out.println("카운트 변수 : " + x);
			continue; 
			// for 문안에서 끝으로 이동해 가라고 명령하는 것이다.= x++
			// while 조건으로
			// do while 조건으로 
			//continue; x= 1 일때, (x % 5 !=0) 의 값은 true 이므로   x++ 로 올라가게 해준다.  
						
					}
				}
		

	}

}
