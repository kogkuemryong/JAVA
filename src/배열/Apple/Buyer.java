package 배열.Apple;

public class Buyer {
	private String name; 
	//field 생성 (속성)
	private int myMoney; // 잔고
	private int numOfApple; // 구입한 사과 갯수
	
	public Buyer(String BeyerName , int money){
		myMoney = money;
		name = BeyerName ;
	}
	// method (기능)
	public void buyerApple(int money, Mart mart) {                
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
