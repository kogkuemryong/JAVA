package 객체지향언어.noticeOverloading;

class Adder{
	public int add(int n1, int n2){
		return n1+n2;
	}
	
	public int add(int n1, int n2, int n3){  
		return n1+n2+n3;
	}
	
	public double add(double n1, double n2){ 
		return n1+n2;
		                                                                
	}   public double add(int n1, double n2){      
		return n1+n2;                                           
	}		                                                     
		public double add(double n1, int n2){        
		return n1+n2;                                           
}	      
}
//		// (주의)반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다. 
//		public double add(int n1, int n2){   반환형이 다르지만 자료형이 같으면 error:
//	        double result = 0.0;             반환형은 결과를 가지고 수행하는 것이지 호출 시에는 inform 이 없기 때문에
//	                                         method overloading 을 하는 것과 관련이 없다. 매개변수가 중요하지  반환형은 상관없다. 
//	        result = n1 +n2; 
//	        return result; 
//		}
//	}

public class noticeOverloading {
	public static void main(String[] args) {
Adder adder = new Adder();
		
		
		System.out.println(adder.add(10, 20));
		// 의도를 정확하게 알 수 있도록 하는것이 좋다. 
		System.out.println(adder.add('A', 10)); 
	     //char 로 정의 되어 있지 않기 때문에 자동형변환 되어 A 가 int 화 되어 숫자<유니코드(정수)>로 출력된다. 
		System.out.println((char)adder.add('A', 10)); // 유니코드(정수) 75 인 k가 출력된다. 
		
		
//		생성자도 method는 아니지만 = 메모리에 할당하는 순간 초기화 한다. 
//		자료형을 범용적으로 사용할 수 있도록 적용의 범위를 확대해줬다. ex) e_mart 의 사과 갯수
//      생성자도 overloading이 가능하다. 
		
	}

}
