package 상속.exam08;

class UnivFriend extends Friend{
	// field 
		private String major;
		
		
		// 생성자 (Constructor) : 값을 전단 받아서 부모의 필드를 초기화 해줘야 한다. 
		UnivFriend (String name,String phoneNum,String address,String major){
			super(name,phoneNum,address);
			this.major = major;
		}
		
		// Method(멤버매서드)
		 public void displayUnivFriendInfo() {
		    	displayFriendInfo(); 
		    	// overring 할 때는 super.을 붙여야 하고 , 그렇지 않을 때에는 붙이지 않아도 된다. 
		    	System.out.println("전공 : "  + major);

		    }

}
