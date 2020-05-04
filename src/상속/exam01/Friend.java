package 상속.exam01;

class Friend {
	private String name ; // 이름
	private String birth ; // 생년월일
	private String address ; // 주소
	private String email ; // 이메일
	
//	Friend(){}
//부모 class에서 생성자는 자식의 class 에서 초기화 될 수 있게 만들어야 한다. 
//상속에서는 부모의 field의 값이 자식의 생성자에서 초기화 될 수 있도록 정의되어야 한다. 
	
	Friend(String name ,  String birth ,  String address , String email ){ 
		
		this.name = name; 
		this.birth = birth; 
		this.address = address; 
		this.email = email; 
		
	}

	public void diplayFriendInfo() {
		System.out.println("이름 : " +name);
		System.out.println("생년월일 : " +birth);
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);

}
	
}
