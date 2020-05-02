package 배열.Apple;

public class Applemain {
	public static void main(String[] args) {
		// new Mart[3]; 
				// 만약 : class Mart 총 할당 된 메모리량이 50byte라면 
				// Heap 안에 50byte 씩 3개가 할당 되어지는 것이 아니다!!!!
				
				Mart eMart = new Mart("이마트" ,  100 , 500);
				Mart homeplus = new Mart("홈플러스" , 200 , 1000);
				Mart walmart = new Mart("월마트" , 300, 2000);
				
		    	Mart[] mart = new Mart[3]; //4byte씩 3개가 할당 된다(주소값만을 넣어주는 것이다)
		    	mart[0] = new Mart("이마트" ,  100 , 500); // 실질적으로 할당된 주소값을 저장
		    	mart[1] = new Mart("홈플러스" , 200 , 1000);
		    	mart[2] = new Mart("월마트" , 300, 2000);
				
				/*
				 * mart.sellApple(); 불러오면 error : mart 배열 안에 class Mart 자체를 넣은 것이 아니라
				 * new Mart("이마트" ,  100 , 500);의 이름값만 가지고 있는 것이다. 
				 * 자료형의 배열 선언은 하나의 이름으로 heap 영역에서 각각의 인스턴스에 접근하도록 하는 것이다.
				 * 참조 자료형의 이름(주소값)을 하나로 관리하겠다는 의미이다. 
				 */
		    	
		    	mart[0]. displayMart(); // 이마트
		        mart[1]. displayMart(); // 홈플러스
		        mart[2]. displayMart(); // 월마트
		
	}

}
