package Generics;

interface SimpleInterface{ // 상속의 관계로 다형성에 의한 부모의 관계로 이걸 받는 자녀 클래스는  추상 매서드를 받드시 사용해야한다.  
	public void showYourName();
}

class UpperClass{
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA extends UpperClass implements  SimpleInterface{  // 2개의 Method를 가지고 있다. 

	@Override
	public void showYourName() {
		System.out.println("Class AAA");
	}
}


class BBB implements  SimpleInterface{  // 2개의 Method를 가지고 있다. 

	@Override
	public void showYourName() {
		System.out.println("Class BBB");
	}
}


public class BoundedTypeparam {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		
		showInstanceAncestor(aaa); // aaa 는 SimpleInterface를 구현하고 있기 때문에 문제 없다. 
		showInstanceAncestor(bbb); // bbb 는 SimpleInterface를 구현하고 있기 때문에 문제 없다. 
		
		showInstanceName(aaa);
		//showInstanceName(bbb); // error extends UpperClass 하지 않기 때문이다. 
		
	}
	
	public static <T extends SimpleInterface> void showInstanceAncestor(T param) {
	// main 인 static 으로 메모리에 올라와 있기 때문에 static을 넣어줘야 한다. 
	// SimpleInterface 는 interface 는 implement를 사용해서 구현해야하지만 	
	// Generics 에서 상속의 개념을 넣을 때는 interface와 상속하는 class  모두 extends 사용한다. 
		
		 
		param.showYourName();
		
		
	}
	
	
	public static <T extends UpperClass> void showInstanceName(T param) {
		
		
		param.showYourAncestor();
		
	}

}
