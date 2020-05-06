package 상속.exam04;

class Adder { 
		public static int val = 0; 
		
		Adder(){}
		
		public void add(int num) {
			val += num ; 
			
		}
	}
	// Adder를 상속 받음. 
	class AdderFriend extends Adder{
		AdderFriend(){
			super();
		}
		// 생성자를 정의 하지 않았는데 error 나지 않은 이유는 
		// 부모 class 에서 생성자를 정의 하지 않았기 때문에 default 값으로 저장 되어 있기 때문에
		// 자식 class 에서도 defualt 값으로 저장 되기 때문에 error 가 나지 않는다. 

		public void friendAdd(int num) {
			// 이름 만으로 사용가능 하다. static 이어도 public, default, profacted 으로 되어 있다면  
	        // 자식 클래스 안에서 사용될 수 있도록 한다. 
	        // static으로 선언 되어 있지 않은 field 안에서도 동일하게 적용된다. 
			
			val += num ;
		}	
			public void showVal() {
				System.out.println(val); // 문제 없이 진행된다.
			}	
}
