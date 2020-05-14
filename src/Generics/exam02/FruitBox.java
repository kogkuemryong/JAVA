package Generics.exam02;

class FruitBox {
	Object item;

public void store(Object item) {  // 모든 참조 자료형의 최상위의 자료형은 Object이니깐 둘다 받을 수 있다. 
	
	this.item =  item;
	
}

public Object pullOut() {
	return item;
}


}
class Apple {
	int weight; // 사과의 무게
	
	Apple(int weight){
		this.weight = weight;
	}
	public void showAppleWeight() {
		System.out.println("사과의 무게 : " + weight);
	}
}

class Orange {
	int sugarContent; // 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent= sugarContent;
	}
	public void  showSugarContent() {
		System.out.println("당분 함량 : " + sugarContent);
	}
}
