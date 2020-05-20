package Friend;

class MiddleFriend extends Friend{
	
    String classNum;
	
	MiddleFriend(String name, String phoneNum, String address, String classNum){
		super(name,phoneNum,address);
		this.classNum=classNum;
	}
	
	// Method(멤버메서드)
	//public void displayUnivFriendInfo() {
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("반 : "+classNum);
	}
	
	// 이름, 전공
	public void displayBasicFriendInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("반 : " + classNum);
	}

}
