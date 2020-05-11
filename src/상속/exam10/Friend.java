package 상속.exam10;

abstract class Friend {
	// class 추상method가 하나라도 있으면 
	// 반드시 abstract 정의 되어야 하며, 
	// 독립적으로 인스턴스로 정의해서 사용하는 자료형이 아닌
	// 부모 class 로 정의해서 사용할 자료형이 아니니깐 new 해서 사용할 수 없다. 
	// 추상의 자료형이라고 해서 그 안에 추상 method가 무조건 있어야 하는 것은 아니다. 
		
		
		
		// field 
		private String name; // 이름 
		private String phoneNum; // 폰번호
		private String address; // 주소
	               
		
		// 생성자 (Constructor)
		 Friend(String name,String phoneNum,String address ){
			
			 this.name = name;
			 this.phoneNum = phoneNum;
			 this.address = address;
		 }
		 
		 public String getName() { // getermethod - 필드에 있는 값을 읽어 가기 위한 method / get이후 첫글자는 대문자를 사용한다.
			                                 // settermethod  - 필드에 있는 값을 업데이트 하기 위한 method 
			 
			 return name; 
			 
		 }
		
		 // Method 
		 public void displayFriendInfo() { 
			 System.out.println("이름 : " + name); 
			 System.out.println("폰번호 : " + phoneNum);
			 System.out.println("주소 : " + address);
			 // (this.)name 붙여도 문제 되지는 않지만 가독성을 높이기 위해서 넣지 않는 것을 선호한다.
		 }
		 
		 // public void  displayBasicFriendInfo() {}
		 // overriding 관계를 만들어주기 위한 method이기 때문에 추가적인 기능이 필요 없다. 
		 // 자식의 class 안에 overriding 되어 있는 method가 출력되게 한다. 
		 // 기능을 목적으로 가진 것이 아닌, 동작을 목적으로 하는 이름만 가진 method 이다. 
		 // 상속의 관계에서 overriding 하기 위한 부모 class로 사용하겠다는 의미부여가 강하게 이루어진다. 
		 // 구조를 잡기 전에 상속의 관계로 이루어질 수 있나? 를 먼저 확인 하는 것이 중요하다. 
		 // Is A 관계가 유지 되는지 보는 것이 중요하다. 
			  
		 
		 //  public void  displayBasicFriendInfo() {} 
		 
		 abstract public void displayBasicFriendInfo(); // 추상메서드 
		 // 상속 관계하에  다형성에 의한 method overriding 하는  method 입니다. 
		 // 기능을 재정의! 순수하게 overriding 되어 기능을 업그레이드 하기 위한 것이다. 
		 // 이름만 빌려주는 것으로 자녀 class에서 기능을 재정의 해서 사용. (불완전한, 완전하지 않은 method)
		 

}
