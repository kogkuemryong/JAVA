/*
문제) 객체 지향 개념없이 사과 판매 프로그램 작성해보기.

	 - 어머니가 e-mart에 가셔서 사과를  5000원어치 사오셨다.
	 - eMart의 이윤과 사과의 재고를 관리하자.(단, 개당 사과의 값은 1,000원)
 */
package 예제;

public class 예제3 {
		public static int stock
		(int money, int priceofapple, int numofapple) {
			
			numofapple -= money/priceofapple;
			System.out.println("남은 사과 갯수(재고) : "  + numofapple);
			return numofapple;
			
		}

		public static int bnf(int money, int benefit) {
			
			benefit += money;
			System.out.println("마트의 이윤 : " + benefit);
			return benefit;
		}	
		
	

	public static void main(String[] args) {


		int e_martstock=1000, e_martbnf = 0;
		int homeplusstock = 1000, homeplusbnf = 0;
		int money = 0;
		
		money= 5000; 
		System.out.println("이마트에서 사과" + money + "원 구매");
		e_martstock = stock(money, 1000, e_martstock);
		e_martbnf = bnf(money,e_martbnf);
		
		money= 5000; 
		System.out.println("이마트에서 사과" + money + "원 구매");
		e_martstock = stock(money, 1000, e_martstock);
		e_martbnf = bnf(money,e_martbnf);
		
		money = 10000;
		System.out.println("홈플러스에서 사과" + money + "원 구매");
		homeplusstock = stock(money, 1000, homeplusstock );
		homeplusbnf  = bnf(money, homeplusbnf);
		
	}
}



