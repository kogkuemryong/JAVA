package 객체지향언어;


class Super{                                                // 참조자료형이라는 의미로 첫글자는 대문자로 한다. 	
	// field (속성) 
	String name; 
	int benefit; // 이윤
	int numOfApple ; // 남은 사과 갯수
	final int APPLE_PRICE ;  // 처음 값을 변경하면 안되는 변수 앞에 final 을 넣어주면 값이 변경 되지 않는다.  
	                                     // java에서 이렇게 변경시킬 수 없는 값을 '상수' 라고 한다. 
	                                     // 상수의 이름은 모두 대문자로 지정해준다. 

	Super(String Martname, int apple, int price){ // 생성자 
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
                                    // 기본자료형을 배운 이유는 객체지향 안에서 속성을 넣어줄 때 사용하기 위해서 배운 것이다. 
class Buyer{                        // Buyer(){} java가 동작되어 지게끔 default 값으로 스스로 만든다. 
	//field 생성 (속성)                // 1) 환경, 문제 조건  안에서 관리해야 하는 데이터를 만들어야 한다. 
	String name; 
	int myMoney; // 잔고
	int numOfApple; // 구입한 사과 갯수
	
	Buyer(String BeyerName , int money){
		myMoney = money;
		name = BeyerName ;
	}
	public void buyerApple(int money, Super mart) {                
		myMoney -= money;
//	    numOfApple +=sellApple(money); // sellApple(money) = num 의 값. 
	                                                          // error : 어디에서 적용되는지 모른다. 어느 판매처에서 사야하는지 모른다. 
	                                                          // 해결점 : 판매처를 정확하게 명시한다. 
		numOfApple +=mart.sellApple(money);  // 구매자와 판매자의 데이터가 update 된다. 
	}
	// 가계부 작성
	public void displayBuyer() {
		System.out.println(name + "잔고 : " + myMoney);
		System.out.println(name +"구입한 사과 개수 : "  + numOfApple);
	}
}

public class AppleMain2 {
	public static void main(String[] args) {
		
		 Super e_mart = new Super(" 이마트 " , 1000, 1000);
		 Super homeplus = new Super(" 홈플러스 " , 800, 2000);
		 Buyer mother = new Buyer(" 어머니 " ,100000);
		 
		 // mother+ e_mart 의 데이터 update
		 mother.buyerApple(5000,e_mart); // java가 제공하는 자료형- int 4byte , 내가 만든 참조자료형 - Mart(주소값) 4byte
		 mother.displayBuyer();
		 e_mart. displayMart(); 
		 
		 
		 //mother+homeplus 의 데이터 update
		 mother.buyerApple(5000,homeplus);
		 mother.displayBuyer();
		 homeplus. displayMart();
		 
		 
		 mother.buyerApple(7000,homeplus);
		 mother.displayBuyer();
		 homeplus. displayMart();
		
		 //e_mart.APPLE_PRICE = 5000; // error 위의 APPLE_PRICE 값에 final을 작성하기였기 때문에 발생한다.  
		 
		 // 
		 Buyer buyer1= new Buyer(" 옆집 아주머니 ", 150000);
		 buyer1.buyerApple(5000, e_mart);
		 buyer1.displayBuyer();
		 e_mart. displayMart(); 
		  // 객체지향을 만들놓으면 대상이 추가 되더라도 언제든 기능을 부여할 수 있다. 
		  // 호출만으로 결과를 출력할 수 있다. 
	}
}

