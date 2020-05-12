package 상속.exam15;


interface Readable{ // 추상메서드만 들어있는 class
	public void read();
}


class OuterClass {

private String name;
	
	
	OuterClass(String name){
		this.name = name;
	}
	
	// method 안에 자료형 선언 가능 : method가 호출 될 때, 자료형이 의미를 가진다. 
	// 기능의 종속적인 자료형. 

	// public LocalClass createLocalClassInst() { 
	// error : method 안에서 선언된 자료형은 method 밖에서는 알지 못하기 때문이다.  
	
	public Readable createLocalClassInst(int num) { // final 을 붙여준거와 동의하게 수행.
		
		class LocalClass implements Readable{
			
			public void read() {
				System.out.println("LocalClass read() : " + name);
				System.out.println("num : " +num);
			}
		}
		//LocalClass  localClass = new  LocalClass();
		Readable  localClass = new  LocalClass();  
		// 상속의 관계로 다형성 overriding을 통해 가능
		
		 return localClass; // 호출하는 쪽으로 전달 
		 // 메서드를 호출하는 순간 외부에서도 사용할 수 있도록 한다. 

	}
}
