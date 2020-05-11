package 상속;

public interface Interface_ {

	public void Mymethod();

	}

	interface YourInterface{
		
		public void YourMethod();
		
	}

	class ourclass implements Interface_ , YourInterface{

		public void Mymethod(){}
		
		public void YourMethod(){}
		
		
	}

	// 인터페이스는 둘 이상을 동시에 구현 가능. 인터페이스의 상속(구현)은 
	//extends 가 아닌 implements를 사용한다.  (다중상속 x)


