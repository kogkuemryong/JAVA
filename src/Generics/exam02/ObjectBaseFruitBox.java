package Generics.exam02;

public class ObjectBaseFruitBox {

	public static void main(String[] args) {
		Orange orange = new Orange(10);
		Apple apple = new Apple(500);

		FruitBox orangeBox = new FruitBox();
		orangeBox.store(orange);
		
		
		FruitBox appleBox = new FruitBox();
		appleBox .store(apple);
		
		// 1) Object 자료형을 (Apple)강제 변환
		Object orangeda = orangeBox.pullOut();
		((Orange) orangeda).showSugarContent();
		
		Object appleda= appleBox . pullOut() ;
		((Apple)appleda).showAppleWeight();
		
		
		// 2) 초기화 할때의 값을 Orange로 강제 변환해서 자장
		Orange tmpOrange = (Orange)orangeBox.pullOut();
		tmpOrange.showSugarContent();
		
		Apple tmpApple = (Apple)appleBox.pullOut();
		tmpApple.showAppleWeight();
		
		FruitBox objectBox = new FruitBox();
		
		objectBox.store("사과"); 
		// "사과"는 String 이고, String 또한 Object 안에 있기 때문에 error 나지 않는다. 
		// 범용적으로 만드는 것은 좋았는데 잘못된 값을 입력하여도  error 나지 않는다는 문제점이 존재한다. (범용적인 사용할 수 있지만 자료형에 있어서는 안전하지 않다.)
		// 자료형을 하나만 선언하면서 잘못된 값이 입력되면 error 할 수 있게 나온 것이 = generics

	}

}
