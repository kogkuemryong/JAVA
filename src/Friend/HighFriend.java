package Friend;

class HighFriend extends Friend{// 고등학교 친구
	// field(필드, 멤버변수)
	private String work; // 직업

	HighFriend(String name, String phoneNum, String address, String work){
		super(name, phoneNum, address);
		this.work = work;
	} 
	
	// Method(멤버메서드)
	//public void displayHighFriendInfo() {
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직업 : " + work);
	}
	
	// 이름, 직업
	public void displayBasicFriendInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("직업 : " + work);
	}

}
