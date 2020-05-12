package 상속.exam13;

public class NestedClassTest {
	public static void main(String[] args) {
		

		OuterClassOne one = new OuterClassOne();
		one.whoAreYou();
		// one.simpleMethod(); //error : static 으로 되어 있다고 해서 메모리가 할당 되는 것이 아니므로 new 해줘야 한다. 
	    
		one.nst.simpleMethod(); // 가능 : 생성자 안에서 메모리 할당을 시켜줬기 때문에 생성자를 가져와서 사용은 가능하다. 
		
		
		new OuterClassOne.NestedClass();

		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		
		nst1.simpleMethod();
		
		
		OuterClassTwo two = new OuterClassTwo();

		
		// error : 접근제시어를 private를 입력하면 소속되어지는 곳 안에서만 사용하겠다는 의미로 외부에서는 사용할 수 없다. 
		// two.nst.simpleMethod(); -  method 접근 x
		// OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass(); - 인스턴스화 x 
	 
		
		
		
		
		
		/*
		내부 class 선언했을 때 static을 붙여주면 OuterClassOne가 인스턴스화가 되든 안되는 상관 없이 , 
		new OuterClassOne.NestedClass();의 모양으로 독자적으로 인스턴스화가 가능하다.
		
		굳이 왜 안에다 선언 했는가? 
		안에 선언된 자료형은 밖의 자료형에 의존적이며, 종속적 의미를 가지고 있다. 
		밖의 자료형을 사용하지 않는다면 안의 자료형을 사용하지 않게 된다. 
		
		static 을 붙이는 이유!
		의존적으로 연관이 되어 있기는 하지만 독립적으로 사용 가능하다는 의미를 가진다. 
		
		*/
		

	}

}
