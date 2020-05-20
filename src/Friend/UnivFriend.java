package Friend;

class UnivFriend extends Friend{// 대학교 친구
	private String major; // 전공

	UnivFriend(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);
		this.major = major;
	}
	
	// Method(멤버메서드)
	//public void displayUnivFriendInfo() {
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("전공 : "+major);
	}
	
	// 이름, 전공
	public void displayBasicFriendInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("전공 : " + major);
	}

}
