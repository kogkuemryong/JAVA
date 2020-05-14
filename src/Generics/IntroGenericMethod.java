package Generics;

public class IntroGenericMethod {

	public static void main(String[] args) {

		FatherClass father = new FatherClass();
		ChildClass child = new ChildClass();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		
		shower.<FatherClass>showInstType2(father);
		shower.showInstType2(father); // <FatherClass> 생략 가능
		// shower.<FatherClass>showInstType(child); // error
		
		shower.<ChildClass>showInstType2(child);
		shower.showInstType2(child);
		
		// 2개 이상의 자료형 사용이 가능하다. 
		shower.<FatherClass,ChildClass>showInstType1(father, child);
		
		shower.showPrintCnt();

	}

}
