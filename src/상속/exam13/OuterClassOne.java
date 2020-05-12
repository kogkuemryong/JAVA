package 상속.exam13;

class OuterClassOne {
	// field
		NestedClass nst;
		
		OuterClassOne(){ // 생성자
		
			nst = new NestedClass();
			nst. simpleMethod();
		}
		
		
		public void whoAreYou() { // 메서드
			System.out.println("who Are you() 호출...");
			nst. simpleMethod();
		    // simpleMethod(); // error :  method 이름만으로 사용은 불가.
			// simpleMethod();  다른 자료형에 있는  method이기 때문에 호출 되지 않는다.(같은 자료형 안에서는 method 이름만으로 호촐 가능) 
			
		}
		
		static class NestedClass{ // static class or  NestedClass 이라 부를 수 있는데, 대부분  NestedClass 이라 부른다. 
			// 동일하게 field , 생성자, method 가능
			// class 는 메모리에 할당 되어지는 순간 사용 가능. 
			// static이 붙어 있고, 없고 상관 없이 동일하게 사용된다(이름만으로 접근이 가능)  - 자료형 내부에서 볼 떄. 
			// main 에서 사용할 때 조금더 쉽도록 하기 위함이지, 메모리에 할당 되는 것이 아니기 때문에 new 되어야 한다. 
			
			
			NestedClass(){
				simpleMethod();
				// whoAreYou(); //  error :  NestedClass가 독자적으로 인스턴스화 하여 메모리에 올라가 있지만 whoareyou 는 
				                       //  메모리에 올라가있지 않기에 불가하다. 
			}
			
			public void simpleMethod() {
				System.out.println("NestedClass => simpleMethod() 호출 ...");
			}	
		}

}
