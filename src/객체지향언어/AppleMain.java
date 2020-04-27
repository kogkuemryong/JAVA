package 객체지향언어;

class Mart{                // 참조자료형이라는 의미로 첫글자는 대문자로 한다. 	
	// field (속성) 
	int benefit; // 이윤
	int numOfApple ; // 남은 사과 갯수

	 Mart(int apple){
		 //System.out.println("실행 ...");
		 numOfApple =  apple;	 
	 }
	 
   //method(사과를 판매 - 행위/기능) 
	public void sellApple(int money) {
		
		int num = 0;	
		num = money / 1000;
		numOfApple -= num;       // 사과의 재고가 빼지면서 누적된다. 
		benefit += money; // 복합대입연산자로 이윤을 누적시킨다. 		
    }
	// 결산
	public void displayMart() {
		System.out.println(" 마트 이윤 : " + benefit);
		System.out.println(" 남은 사과 갯수 : " + numOfApple);
	}		
}
public class AppleMain {
	public static void main(String[] args) {
		
		Mart e_mart;              // 생성자 : class 의 이름과 같아야 한다. 반환형이 없다. java에 의해서 memory 생성시 딱 1번만 수행된다. 
		e_mart = new Mart(100);   //  1) 메모리를 할당해주고, Mart의 주소값을 준다.
		                          //  2) 위의 Mart() 를 호출해준다. : 초기화를 해준다. 
		e_mart.sellApple(98000);  //  필드의 값을 메모리에 할당해서 그 값으 주소값을 주고 초기화 하는데 활용하게 해준다. 
	 	e_mart.displayMart();
		
		e_mart.sellApple(2000);
		e_mart.displayMart();
		
	    Mart homePlus;
	    homePlus = new Mart(100);
	    
	    homePlus.sellApple(100000);
	    homePlus.displayMart();
	    
		// 자료형만 잘 지어주면 결과값은 언제든지 얻어낼 수 있다. 
	    // 객체의 이름만 알고 있다면 언제든 수행할 수 있다. 
	    // 자료형을 만들어두면 새로운 객체가 생길 때 마다 그 값

		
		
	}

}
