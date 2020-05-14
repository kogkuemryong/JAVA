package Generics.exam01;

class Apple {
	int weight; // 사과의 무게


Apple(int weight){
	this.weight = weight;
	
}

public void showAppleWeight() {
	System.out.println("사과의 무게 : " + weight);
	
}

}

class AppleBox{
	Apple item;
	
	
	public void store(Apple item) {    // 포장
		this.item = item;
	}
	
	public Apple pullOut() { // 사과 꺼내기 
		return item;
	}
}

