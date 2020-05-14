package Generics;

public class GenericBaseFruiBox {

	public static void main(String[] args) {
		
		
		// Generics : 
		// 하나의 자료형으로 범용적으로 사용고 싶을 때: new 선언시에 자료형을 결정하도록 하여 안정성을 확보한다. 

				FruitBox<Apple> appleBox = new FruitBox<Apple> ();   
				// FruitBox appleBox = new FruitBox<Apple> (); 
				//  8버전 부터 참조변수를 선언할 때 생략해도 문제 되지 않는다. 
				
				// new 했을 떄, <T> 로 지정되었던 것이 <Apple>으로 대입해서 사용된다. 
				// 자료형의 type 이 apple로 고정된다. 
				
				Apple apple = new Apple(700);
				
				appleBox. store(apple);
				// appleBox. store("사과")); // error : 자료형이 안정적으로 사용될 수 있게 되었다.  
				
				
				Apple tmpApple = appleBox.pullOut();
				tmpApple. showAppleWeight();
				
				 FruitBox<Orange> OrangeBox = new FruitBox<Orange> ();
				 
				 Orange orange = new Orange (7);
				 
				 OrangeBox.store(orange);
				 // OrangeBox.store(apple); //자료형이 잘못입력되어 error 
				 
				 Orange tmpOrange = OrangeBox.pullOut();
				 tmpOrange.showSugarContent();

	}

}
