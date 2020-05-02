package 배열.Apple;

class Mart {
	// 참조자료형이라는 의미로 첫글자는 대문자로 한다. 	
		// field (속성) 
		String name; 
		private int benefit; // 이윤
		private int numOfApple ; // 남은 사과 갯수
		private final int APPLE_PRICE ;  // 처음 값을 변경하면 안되는 변수 앞에 final 을 넣어주면 값이 변경 되지 않는다.  
		                                     // java에서 이렇게 변경시킬 수 없는 값을 '상수' 라고 한다. 
		                                     // 상수의 이름은 모두 대문자로 지정해준다. 
		
		 Mart(String Martname, int apple, int price){ // 생성자 
			 // Mart(){} // default 
			 // System.out.print("실행 ...");
			 numOfApple =  apple;
			 name = Martname;
			 APPLE_PRICE = price;
		 }
	      
	    //method(사과를 판매 - 행위/기능) 
		public int sellApple(int money) {
			
			int num = 0;	
			num = money / APPLE_PRICE;
			numOfApple -= num;       // 사과의 재고가 빼지면서 누적된다. 
			benefit += money; // 복합대입연산자로 이윤을 누적시킨다. 
			
			return num;
	    }
		// 결산
		public void displayMart() {
			System.out.println(name + " 마트 이윤 : " + benefit);
			System.out.println(name + " 남은 사과 갯수 : " + numOfApple);
		}
}
