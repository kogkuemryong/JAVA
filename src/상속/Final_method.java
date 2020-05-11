package 상속;

final class Final_method {

	 // 클래스  Final_method 가 상속 되는 것을 허용하지 않는다. 
		// 독자적으로 사용하기 위해서 만들어 둔 것으로, 잘못사용하게 되면 프로그램의 문제가 일어날 수 있기에 
		// final keyword를 넣어준다. 

		final double PI = 3.14;
		// final 이 붙은 필드는 값을 변경하지 못한다. 
	 	
	}


	class Yourclass{
		
	      final void yourFunc(int n) {}
		
	      // 클래스 Yourclass 가 상속되는 것을 혀용하되, 메소드 yourFunc의 오버라이디은 허용하지 않는다.
	}

	// 대표적인 final 메소드로는 Object 클래스의 wait, notify, notifyall 메소드
	// 등이 있으며, 이들은 실제로 오버라이딩이 바람직하지 않은 메소드들이다.
