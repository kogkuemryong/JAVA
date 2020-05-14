package Generics.exam01;

public class FruitBaseBox {

	public static void main(String[] args) {

		Apple apple = new Apple(500); // 500g 사과
		
		AppleBox appleBox  = new AppleBox();
		
		appleBox.store(apple); // 사과를 포장 = 자료형에는 안전하나, 자료형 선언을 추가해야 하는 불편함이 따른다. 
	    Apple tmpApple = appleBox.pullOut() ; // 사과를 꺼내어 보니
	    tmpApple.showAppleWeight(); // 사과의 무게 = 500g
        
	    
	    System.out.println("====================\n");
	    
	   
	    Orange orange = new Orange(10);
	    OrangeBox orangeBox = new OrangeBox();
	    
	    
	    orangeBox.store(orange); // 오렌지 포장 
	    Orange tmpOrange = orangeBox.pullOut(); // 오렌지 꺼냄
	    
	    tmpOrange.showSugarContent(); // 오렌지의 당분 확인(10)
		
	}

}
