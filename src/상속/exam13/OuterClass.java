package 상속.exam13;

class OuterClass {
	class InnerClass{
		
	}

	}

	/*
	클래스의 정의가 다른 클래스의 내부에 삽입될 수 있다. 
	이때 외부의 클래스를 가리켜 Outer 클래스라 하고, 
	내부의 클래스를 가리켜 Inner 클래스라 한다.
	*/

	class OuterClass2{


		static class NestedClass{
			
		}
	}


	/*
	 Inner 클래스의 형태에 static 선언이 삽입되면, 
	 이를 가리켜 static Inner 클래스 또는 간단히 Nested 클래스라 한다.
	*/



