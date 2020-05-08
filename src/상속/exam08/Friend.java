package 상속.exam08;

class Friend {
	// 공통 특징 
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
		
		 // Method 
		 public void displayFriendInfo() { 
			 System.out.println("이름 : " + name); 
			 System.out.println("폰번호 : " + phoneNum);
			 System.out.println("주소 : " + address);
			 // (this.)name 붙여도 문제 되지는 않지만 가독성을 높이기 위해서 넣지 않는 것을 선호한다.
			 
			 
		 }

}
