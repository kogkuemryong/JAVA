package 상속.exam10;

class UnivFriend extends Friend{
	// field 
		private String major;
		
		
		// 생성자 (Constructor) : 값을 전단 받아서 부모의 필드를 초기화 해줘야 한다. 
		UnivFriend (String name,String phoneNum,String address,String major){
			super(name,phoneNum,address);
			this.major = major;
		}
		
		// Method(멤버매서드)
		// public void displayUnivFriendInfo() {
			 public void displayFriendInfo() { 
		    	super.displayFriendInfo(); // 부모의 method 호출
		    	System.out.println("전공 : "  + major);

		    }
			 
		// 이름 , 전공(부모  class의 field , 자녀 class의 field)
			 
			 public void  displayBasicFriendInfo() {
				 System.out.println("이름 : " + getName());
				 System.out.println("전공 : " + major);
			 }

}
